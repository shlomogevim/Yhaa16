package com.example.yhaa16

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_animation_screen.*
import kotlinx.android.synthetic.main.current_position_layout.*
import kotlinx.android.synthetic.main.god_layout.*
import kotlinx.android.synthetic.main.man_layout.*


class AnimationScreen : AppCompatActivity() {
    companion object {
        const val TALKER = "talker"
        const val STYLE = "style"
        const val OPERATELIST = "opreratelist"
    }

    lateinit var talkList: ArrayList<Talker>
    lateinit var operateList: ArrayList<List<Int>>

    var current_styleNum=0
    var current_animNum=0
    var current_dur= 1000L
    var current_textSize=28f

    private var manMode = true
    private var counterStep = 1

    lateinit var animationInAction1: AnimationAction1

    val PREFS_NAME = "myPrefs"
    val CURRENT_SPEAKER = "currentSpeakertext10"
    lateinit var myPref: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    var animList = arrayListOf<String>()
    var actionAnimList= arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)
        initValues()
        buttonZone()

        //  Page.createBasicStyle()

        updateTalkList()

        //  saveData()
        retriveData()

        generalOperation()     // Let's play
    }

    private fun saveData() {
        var gson = Gson()
        var jsonString = gson.toJson(operateList)
        editor.putString(OPERATELIST, jsonString)
        editor.apply()

    }

    private fun retriveData() {
        operateList.clear()
        var gson = Gson()
        var jsonString = myPref.getString(OPERATELIST, null)
        if (jsonString==null){
            saveData()
        }else{
        var type = object : TypeToken<ArrayList<List<Int>>>() {}.type
        operateList = gson.fromJson(jsonString, type)

        }

    }


    private fun initValues() {
        seekBarTextSize.max = 200
        seekBarDuration.max = 5000
        myPref = getSharedPreferences(PREFS_NAME, 0)
        editor = myPref.edit()
        counterStep = myPref.getInt(CURRENT_SPEAKER, 1)
        animationInAction1 = AnimationAction1(this, mainLayout)


        @Suppress("UNCHECKED_CAST")
        talkList = intent.getSerializableExtra(TALKER) as ArrayList<Talker>
        @Suppress("UNCHECKED_CAST")
        operateList = intent.getSerializableExtra(STYLE) as ArrayList<List<Int>>
        menipulateListView()


    }

    private fun menipulateListView() {
        Page.createBasicStyle()
        /*for (i in 0..15){
            animList.add("1")
        }*/
        for (item in Page.styleArray) {
            val st = item.num.toString()
            animList.add(st)
        }
        for (i in 0..15){
            animList.add("1000")
        }
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animList)
        animView.adapter = adapter

        for (i in 0..15){
            actionAnimList.add("1")
        }
        val list= arrayListOf("4", "10", "20", "30", "40", "50", "60")
        actionAnimList.addAll(list)
        for (i in 0..15){
            actionAnimList.add("1000")
        }
        var adapter1 =ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, actionAnimList)
        actioAnimLv.adapter = adapter1

    }


    private fun generalOperation() {

        if (counterStep < 1) counterStep = 1

        counterStep = 1           //*********************

        manMode = counterStep % 2 != 0

        val talker = talkList[counterStep]
        updateTitleTalkerSituation()
        animationInAction1.excuteTalker(talker)
        upgradeAllWigets(talker)

    }

    private fun upgradeAllWigets(talker: Talker) {

        val sty=talker.styleNum.toString()

        animView.smoothScrollToPositionFromTop(10,0)



        /*  for (index in 0..animList.size-1){
              if(sty==animList[index]){
                  animView.smoothScrollToPositionFromTop(index,0)
              }
          }*/

    }


    fun enterDefaltValueToTalkList(ind: Int, talker: Talker): Talker {
        if (ind < operateList.size) {
            val item = operateList[ind]
            talker.styleNum = item[0]
            talker.animNum = item[1]
            talker.dur = item[2].toLong()
            talker.textSize = item[3].toFloat()
        } else {
            if (talker.whoSpeake == "man") {
                talker.styleNum = 210
                talker.animNum = 3
                talker.dur = 2000L
                talker.textSize = 28f
            }
            if (talker.whoSpeake == "god") {
                talker.styleNum = 200
                talker.animNum = 2
                talker.dur = 2000L
                talker.textSize = 48f
            }
        }
        return talker
    }


    private fun updateTalkList() {
        //   operateList = FileStyling.initFileText11()
        for (ind in 1 until talkList.size) {
            talkList[ind] = enterDefaltValueToTalkList(ind, talkList[ind])
        }
    }
// the idea is to isolate the text item from the style item for ease to correct them

    private fun updateTitleTalkerSituation() {
        val talker = talkList[counterStep]
        with(talker) {
            var text =
                "l/->$lines style->$styleNum anim->$animNum size->$textSize dur->$dur $whoSpeake"
            tvAnimatinKind.text = text
        }
        tvPage.text = counterStep.toString()
        val text1="current p: style->$current_styleNum action->$current_animNum size->$current_textSize dur->$current_dur "
        currentParameterTv.text=text1
    }


    private fun buttonZone() {
        saveButton.setOnClickListener {
            with (talkList[counterStep]) {
                styleNum = current_styleNum
                animNum = current_animNum
                dur = current_dur
                textSize = current_textSize
            }
            editor.putInt(CURRENT_SPEAKER, counterStep)
            editor.commit()
            updateTitleTalkerSituation()
        }
        animView.setOnItemClickListener { parent, view, position, id ->
            current_styleNum=animList[position].toInt()
            updateTitleTalkerSituation()
        }
        actioAnimLv.setOnItemClickListener { parent, view, position, id ->
            current_animNum=actionAnimList[position].toInt()
            updateTitleTalkerSituation()
        }

        seekBarDuration.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                seekBarTextviewDuaration.text = progress.toString()
                current_dur=progress.toLong()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

                updateTitleTalkerSituation()
            }

        })


        seekBarTextSize.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                val talker = talkList[counterStep]
                updateTitleTalkerSituation()
            }

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                current_textSize=progress.toFloat()

            }

        })

        goddy.setOnClickListener {
            if (manMode) {
                counterStep++
                generalOperation()
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האדם לדבר", Toast.LENGTH_LONG).show()
            }
        }

        man.setOnClickListener {
            if (!manMode) {
                counterStep++
                generalOperation()
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האין סוף להגיב", Toast.LENGTH_LONG).show()
            }
        }
        nextButton.setOnClickListener {
            counterStep++
            generalOperation()
            editor.putInt(CURRENT_SPEAKER, counterStep)
            editor.commit()
        }
        previousButton.setOnClickListener {
            counterStep--
            if (counterStep < 1) counterStep = 1
            generalOperation()
        }

        init_button.setOnClickListener {
            counterStep = 1
            editor.putInt(CURRENT_SPEAKER, counterStep)
            editor.commit()
            generalOperation()
        }
        mainLayout.setOnClickListener {
            /* counterStep++
             generalOperation()
             editor.putInt(CURRENT_SPEAKER, counterStep)
             editor.commit()*/
        }
        btnTry.setOnClickListener {

            animView.smoothScrollToPositionFromTop(5,0)



        }
    }


}








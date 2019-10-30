package com.example.yhaa16

object Page {
    val baseColorList = ArrayList<StyleObject>()


    val styleArray = ArrayList<StyleObject>()
    fun createBasicStyle() {

        var list = listOf<StyleObject>(

            StyleObject(10, "#ffffff", "#000000", 24f, 1, 5, 0, 5, 0),
            StyleObject(11, "#000000", "#ffffff", 24f, 1, 5, 0, 5, 0),
            StyleObject(20, "#5f4b8bff", "#e69abdff", 24f, 1, 5, 0, 5, 0),
            StyleObject(21, "#e69abdff", "#5f4b8bff", 24f, 1, 5, 0, 5, 0),
            StyleObject(30, "#000000ff", "#ffffffff", 24f, 1, 5, 0, 5, 0),
            StyleObject(31, "#ffffffff", "#000000ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(40, "#00a4ccff", "#f95700ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(41, "#f95700ff", "#00a4ccff", 24f, 1, 5, 0, 5, 0),
            StyleObject(50, "#00203fff", "#adefd1ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(51, "#adefd1ff", "#00203fff", 24f, 1, 5, 0, 5, 0),
            StyleObject(60, "#606060ff", "#d6ed17ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(61, "#d6ed17ff", "#606060ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(70, "#2c5f2d", "#97bc62ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(71, "#97bc62ff", "#2c5f2d", 24f, 1, 5, 0, 5, 0),
            StyleObject(80, "#00539cff", "#eea47fff", 24f, 1, 5, 0, 5, 0),
            StyleObject(81, "#eea47fff", "#00539cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(90, "#0063b2ff", "#9cc3d5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(91, "#9cc3d5ff", "#0063b2ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(100, "#101820ff", "#fee715ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(101, "#fee715ff", "#101820ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(110, "#b1624eff", "#5cc8d7ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(111, "#5cc8d7ff", "#b1624eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(120, "#89abe3ff", "#fcf6f5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(121, "#fcf6f5ff", "#89abe3ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(130, "#101820ff", "#f2aa4cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(131, "#f2aa4cff", "#101820ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(140, "#195190ff", "#a2a2a1ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(141, "#a2a2a1ff", "#195190ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(150, "#2bae66ff", "#fcf6f5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(151, "#fcf6f5ff", "#2bae66ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(160, "#2d2926ff", "#e94b3cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(161, "#e94b3cff", "#2d2926ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(170, "#990011ff", "#fcf6f5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(171, "#fcf6f5ff", "#990011ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(180, "#faebefff", "#333d79ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(181, "#333d79ff", "#faebefff", 24f, 1, 5, 0, 5, 0),
            StyleObject(190, "#f93822ff", "#fdd20eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(191, "#fdd20eff", "#f93822ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(400, "#006b38ff", "#101820ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(401, "#101820ff", "#006b38ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(410, "#ffd662ff", "#00539cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(411, "#00539cff", "#ffd662ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(420, "#d7c49eff", "#343148ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(421, "#343148ff", "#d7c49eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(430, "#df6589ff", "#3c1053ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(431, "#3c1053ff", "#df6589ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(440, "#ffe77aff", "#2c5f2dff", 24f, 1, 5, 0, 5, 0),
            StyleObject(441, "#2c5f2dff", "#ffe77aff", 24f, 1, 5, 0, 5, 0),
            StyleObject(450, "#fcf951ff", "#422057ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(451, "#422057ff", "#fcf951ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(460, "#1c1c1bff", "#ce4a7eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(461, "#ce4a7eff", "#1c1c1bff", 24f, 1, 5, 0, 5, 0),
            StyleObject(470, "#00b1d2ff", "#fddb27ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(471, "#fddb27ff", "#00b1d2ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(480, "#00239cff", "#e10600ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(481, "#e10600ff", "#00239cff", 24f, 1, 5, 0, 5, 0),


            StyleObject(200, "#ffffff", "#000000", 24f, 1, 10, 0, 10, 0),
            StyleObject(210, "#000000", "#ffffff", 24f, 1, 10, 0, 10, 0),
            StyleObject(211, "#000000", "#bdbdbd", 28f, 1, 10, 5, 10, 5),
            StyleObject(212, "#fbc02d", "#ffffff", 28f, 1, 10, 5, 10, 5),
            StyleObject(213, "#d1c4e9", "#ffffff", 28f, 1, 10, 5, 10, 5),
            StyleObject(220, "#bdbdbd", "#000000", 28f, 1, 10, 5, 10, 5),
            StyleObject(230, "#ffebee", "#e91e63", 35f, 1, 80, 0, 80, 0),
            StyleObject(240, "none", "#1e88e5", 50f, 1, 10, 20, 10, 20),
            StyleObject(250, "none", "#ffffff", 28f, 1, 10, 5, 10, 5),
            StyleObject(260, "none", "#44000D", 28f, 1, 20, 20, 20, 20),
            StyleObject(270, "#e3f2fd", "#44000D", 28f, 1, 10, 20, 10, 20),
            StyleObject(280, "none", "#6ff9ff", 28f, 1, 10, 5, 10, 0),
            StyleObject(290, "none", "#f9a825", 28f, 1, 10, 80, 10, 20),
            StyleObject(300, "#e3f2fd", "#1e88e5", 28f, 1, 10, 5, 10, 5)


        )
        styleArray.addAll(list)
    }

    fun createBasicStyle1() {
        var list1 = listOf(
            StyleObject(10, "#ffffff", "#000000", 24f, 1, 5, 0, 5, 0),
            StyleObject(11, "#000000", "#ffffff", 24f, 1, 5, 0, 5, 0),
            StyleObject(20, "#5f4b8bff", "#e69abdff", 24f, 1, 5, 0, 5, 0),
            StyleObject(21, "#e69abdff", "#5f4b8bff", 24f, 1, 5, 0, 5, 0),
            StyleObject(30, "#000000ff", "#ffffffff", 24f, 1, 5, 0, 5, 0),
            StyleObject(31, "#ffffffff", "#000000ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(40, "#00a4ccff", "#f95700ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(41, "#f95700ff", "#00a4ccff", 24f, 1, 5, 0, 5, 0),
            StyleObject(50, "#00203fff", "#adefd1ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(51, "#adefd1ff", "#00203fff", 24f, 1, 5, 0, 5, 0),
            StyleObject(60, "#606060ff", "#d6ed17ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(61, "#d6ed17ff", "#606060ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(70, "#2c5f2d", "#97bc62ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(71, "#97bc62ff", "#2c5f2d", 24f, 1, 5, 0, 5, 0),
            StyleObject(80, "#00539cff", "#eea47fff", 24f, 1, 5, 0, 5, 0),
            StyleObject(81, "#eea47fff", "#00539cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(90, "#0063b2ff", "#9cc3d5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(91, "#9cc3d5ff", "#0063b2ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(100, "#101820ff", "#fee715ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(101, "#fee715ff", "#101820ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(110, "#b1624eff", "#5cc8d7ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(111, "#5cc8d7ff", "#b1624eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(120, "#89abe3ff", "#fcf6f5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(121, "#fcf6f5ff", "#89abe3ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(130, "#101820ff", "#f2aa4cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(131, "#f2aa4cff", "#101820ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(140, "#195190ff", "#a2a2a1ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(141, "#a2a2a1ff", "#195190ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(150, "#2bae66ff", "#fcf6f5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(151, "#fcf6f5ff", "#2bae66ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(160, "#2d2926ff", "#e94b3cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(161, "#e94b3cff", "#2d2926ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(170, "#990011ff", "#fcf6f5ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(171, "#fcf6f5ff", "#990011ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(180, "#faebefff", "#333d79ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(181, "#333d79ff", "#faebefff", 24f, 1, 5, 0, 5, 0),
            StyleObject(190, "#f93822ff", "#fdd20eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(191, "#fdd20eff", "#f93822ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(400, "#006b38ff", "#101820ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(401, "#101820ff", "#006b38ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(410, "#ffd662ff", "#00539cff", 24f, 1, 5, 0, 5, 0),
            StyleObject(411, "#00539cff", "#ffd662ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(420, "#d7c49eff", "#343148ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(421, "#343148ff", "#d7c49eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(430, "#df6589ff", "#3c1053ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(431, "#3c1053ff", "#df6589ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(440, "#ffe77aff", "#2c5f2dff", 24f, 1, 5, 0, 5, 0),
            StyleObject(441, "#2c5f2dff", "#ffe77aff", 24f, 1, 5, 0, 5, 0),
            StyleObject(450, "#fcf951ff", "#422057ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(451, "#422057ff", "#fcf951ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(460, "#1c1c1bff", "#ce4a7eff", 24f, 1, 5, 0, 5, 0),
            StyleObject(461, "#ce4a7eff", "#1c1c1bff", 24f, 1, 5, 0, 5, 0),
            StyleObject(470, "#00b1d2ff", "#fddb27ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(471, "#fddb27ff", "#00b1d2ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(480, "#00239cff", "#e10600ff", 24f, 1, 5, 0, 5, 0),
            StyleObject(481, "#e10600ff", "#00239cff", 24f, 1, 5, 0, 5, 0)
        )
        baseColorList.addAll(list1)
    }
}




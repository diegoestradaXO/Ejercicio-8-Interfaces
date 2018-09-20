package Shapes

import behaviors.Describe
import behaviors.Draw

class Triangle: Draw, Describe {
    var height: Int;

    constructor(){
        height = 0
    }
    override fun draw():String{
        var shape = ""
        for (i in 0 until height) {
            for (k in i until height) {
                shape += " "
            }
            for (j in 0..i) {
                if (i != height - 1)
                    if (j == 0 || j == i)
                        shape +="*"
                    else
                        shape+="*"
                else
                    shape+="*"
                shape+=" "
            }
            shape+="\n"
        }
        return shape
    }
    override fun describe(){
        println("Ingresa la altura: ")
        var height = readLine()!!.toInt()
        this.height = height
    }
}
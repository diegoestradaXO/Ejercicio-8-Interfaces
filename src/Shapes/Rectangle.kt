package Shapes

import behaviors.Describe
import behaviors.Draw

class Rectangle: Draw, Describe{
    var height: Int
    var width: Int

    constructor(){
        height = 0
        width = 0
    }
    override fun draw():String{
        var shape = ""
        for (i in 1..height){
            for (j in 1..width){
                shape += "*"
            }
            shape += "\n"
        }
        return shape
    }
    override fun describe(){
        println("Ingresa la altura: ")
        var height = readLine()!!.toInt()
        println("Ingrese el ancho")
        var width = readLine()!!.toInt()
        this.height = height
        this.width= width

    }

}
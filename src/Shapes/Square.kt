package Shapes

import behaviors.Describe
import behaviors.Draw

class Square: Draw, Describe {
    var sideDimension: Int

    constructor(){
        sideDimension = 0
    }
    override fun draw():String{
        var shape = ""
        for (i in 1..sideDimension){
            for (j in 1..sideDimension){
                shape += "*"
            }
            shape += "\n"
        }
        return shape
    }
    override fun describe(){
        println("Ingresa la altura: ")
        var side = readLine()!!.toInt()
        this.sideDimension = side
    }


}
import Shapes.*
import behaviors.*
import sun.font.TrueTypeFont

fun getMenu(isOnMain: Boolean): String {
    var menu = ""
    if (isOnMain) {
        menu = "Menu Principal:\n-------------\n1.Dibujar una figura\n2.Salir"
    }

    if (!isOnMain) {
        menu = "Menu:\n" +
                "-------------\n" +
                "1.Dibujar una cuadrado\n" +
                "2.Dibujar una triangulo\n" +
                "3.Dibujar una rectangulo\n" +
                "4.Salir al menu principal\n"
    }

    return menu
}

// aqui inicia la ejecucion
fun main(args: Array<String>) {
    var isOnMain = true
    var wantsToContinue = true
// ciclo principal, segun la opcion ingresada realiza un accion
    do {
        println(getMenu(isOnMain))
        print("Ingrese una opcion: ")
        val strOption = readLine()!!
        val option = strOption.toInt()
        if (isOnMain) {
            when (option) {
                1 -> {
                    isOnMain = !isOnMain
                    //print(println(getMenu(isOnMain)))
                    //print("Ingrese una opcion: ")
                }
                2 -> {
                    wantsToContinue = false
                }
            }

        } else {
            when (option) {
                1 -> {
                    print("Dibujando un cuadrado")
                    val mySquare = Square()
                    describe(mySquare)
                    draw(mySquare)

                }
                2 -> {
                    print("Dibujando un triangulo")
                    val myTriangle = Triangle()
                    describe(myTriangle)
                    draw(myTriangle)
                }
                3 -> {
                    print("Dibujando un rectangulo")
                    val myRectangle = Rectangle()
                    describe(myRectangle)
                    draw(myRectangle)
                }
                4 -> {
                    isOnMain = true
                }
            }
        }
    } while (wantsToContinue)

}
fun describe(describer: Describe){
    describer.describe()
}
fun draw(drawer: Draw){
    print(drawer.draw())
}

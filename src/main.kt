import javafx.application.Application
import tornadofx.*
import java.util.*

class MyApp: App(MyView::class)

class MyView: View() {
    val label = label()
    val stack = Stack<String>();

        override var root = vbox {
            add(label);
            hbox{
                button("1") {
                    action {
                        println("1!")
                        label.text="1"
                    }
                }
                button("2") {
                    action {
                        println("2!")
                    }
                }
                button("3") {
                    action {
                        println("3!")
                    }
                }
            }
            hbox {
                button("4") {
                    action {
                        println("4!")
                    }
                }
                button("5") {
                    action {
                        println("5!")
                    }
                }
                button("6") {
                    action {
                        println("6!")
                    }
                }
            }
            hbox{
                button("7") {
                    action {
                        println("7!")
                    }
                }
                button("8") {
                    action {
                        println("8!")
                    }
                }
                button("9") {
                    action {
                        println("9!")
                    }
                }
                button("0") {
                    action {
                        println("0!")
                    }
                }
            }
            hbox {
                button("+") {
                    action {
                        println("+!")
                        stack.push(label.toString())
                        println(stack)
                    }
                }
                button("-") {
                    action {
                        println("-")
                    }
                }
                button("/") {
                    action {
                        println("/")
                    }
                }
                button("*") {
                    action {
                        println("*")
                    }
                }
                button("(") {
                    action {
                        println("(")
                    }
                }
                button(")") {
                    action {
                        println(")")
                    }
                }

                button(".") {
                    action {
                        println(".")
                    }
                }

            }

        label("Calculator")
    }
}
fun addNumbers(){

}

fun main(args: Array<String>) {
    Application.launch(MyApp::class.java, *args)
}



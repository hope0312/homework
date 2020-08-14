package BoxTest.kotlin

import BoxTester.Box
import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    println("Please enter object's length:")
    var length = scanner.nextFloat()
    println("Please enter object's width:")
    var width = scanner.nextFloat()
    println("Please enter object's height:")
    var height = scanner.nextFloat()

    var box3 = Box3(length,width,height)
    var box5 = Box5(length,width,height)
    if(box3.validate(length,width,height))
        println("Box3")
    else if (box5.validate(length,width,height))
        println("Box5")
    else
        println("no box for u ?")
}



open class Boxer(var length :Float,var width:Float,var height :Float){
    open fun validate(length: Float,width: Float,height: Float):Boolean= if(this.length >= length && this.width >= width && this.height >= height)true else false
}

class Box3(length: Float,width: Float,height: Float):Box(23f,14f,13f){

}
class Box5(length: Float,width: Float,height: Float):Box(39.5f,27.5f,23f){

}

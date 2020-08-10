package com.train

import sun.security.krb5.internal.Ticket
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    print("Please enter number of tickets:\n");
    var tickets = scanner.nextInt();
    print("How many round-trip tickets:\n");
    var roundtickets = scanner.nextInt();



    val tra = Train(tickets,roundtickets);
    tra.print();
}

class Train(var tickets: Int, var roundtickets:Int){
    fun print(){
        println("Total tickets:"+(tickets+roundtickets)+"\n"+"Round-trip:"+roundtickets+"\n"+"Total:"+((tickets*1000)+(roundtickets*2000*0.9)).toInt());
    }
}
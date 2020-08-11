package com.train

import sun.security.krb5.internal.Ticket
import java.util.*

fun main(args: Array<String>) {
    while(true) {
        print("input -1 break\n")
        val scanner = Scanner(System.`in`);
        print("Please enter number of tickets:\n");
        var tickets = scanner.nextInt();
        if (tickets == -1) {
            println("thank~see u ")
            break
        }
        print("How many round-trip tickets:\n");
        var roundtickets = scanner.nextInt();
        if (roundtickets == -1) {
            println("thank~ see u ")
            break
        }


        val tra = Train(tickets, roundtickets);
        tra.print();
    }
}

class Train(var tickets: Int, var roundtickets:Int){
    fun print(){
        println("Total tickets:"+(tickets+roundtickets)+"\n"+"Round-trip:"+roundtickets+"\n"+"Total:"+((tickets*1000)+(roundtickets*2000*0.9)).toInt());
    }
}
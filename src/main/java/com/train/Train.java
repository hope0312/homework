package com.train;

public class Train {
    int tickets;
    int roundtickets;

    public Train(int tickets, int roundtickets){
        this.tickets = tickets;
        this.roundtickets = roundtickets;
    }
    public void print(){
        System.out.println("Total tickets:"+(tickets+roundtickets)+"\n"+"Round-trip:"+roundtickets+"\n"+"Total:"+(int)((tickets*1000)+(roundtickets*2000*0.9)));
    }
}


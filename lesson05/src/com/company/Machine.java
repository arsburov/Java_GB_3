package com.company;

public abstract class Machine {
    protected String name;
    protected float capacity;
    protected float consumption;
    protected float balance;

//    public Machine(String name) {
//        this.name = name;
//    }

    public Machine(String name, float capacity, float consumption) {
        this.name = name;
        this.capacity = capacity;
        this.consumption = consumption;
        this.balance = capacity;
    }

    public void drive (){
        try {
            while(true){
                System.out.println(String.format("%s rides", name));
                Thread.sleep(3000);
                balance -= consumption;
                System.out.println(balance);
            }
        } catch (Exception e){
            throw new RuntimeException("SWW", e);
        }
    }
}

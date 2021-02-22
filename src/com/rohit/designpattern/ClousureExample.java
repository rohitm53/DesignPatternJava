package com.rohit.designpattern;

public class ClousureExample {

    public static void main(String[] args) {

        int a = 10;
        int b=14;

        doProcess(i -> System.out.println(i+b),a);

    }

    public static void doProcess(Process p,int i){
        p.process(i);
    }


    interface Process {
        void process(int i);
    }

}

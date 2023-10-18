package org.example;

import java.awt.*;

public class Letters {

    public void methodA(String input)
    {
        if(input.equals("Hello World"))
        {
            System.out.println("j");
        }
        else {
            methodB(input);
        }
        System.out.println("a");
    }

    public void methodB(String start){
        System.out.println("v");
    }
    public void methodC(String input){
        System.out.println("a");
        if(input.length()<4)
        {
            System.out.println("e");
        }
        System.out.println("r");
    }
    public void methodD(String input){
        System.out.println("s");
        System.out.println("j");
        System.out.println("o");
        System.out.println("v");
        System.out.println("t");
    }
}

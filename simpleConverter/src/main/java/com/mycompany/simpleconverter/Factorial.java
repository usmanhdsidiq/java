package com.mycompany.simpleconverter;

public class Factorial {
    public int number;

    public int getNumber(){
        return number;
    }

    public void setNumber(int newNumber){
        this.number = newNumber;
    }


    //this calculation method is using recursion a.k.a 'recursive'
    static int fact(int n){
        if (n == 0) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }

    public void calc(){
        int i = fact(number);

        System.err.println(number+"! = "+i);
    }
}

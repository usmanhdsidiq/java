package com.mycompany.simpleconverter;

public class Numeric {
    public String binary;
    public int decimal;

    //setter
    public String getBinary(){
        return binary;
    }
    public int getDecimal(){
        return decimal;
    }

    //getter
    public void setBinary(String newBinary){
        this.binary = newBinary;
    }
    public void setDecimal(int newDecimal){
        this.decimal = newDecimal;
    }

    //general classes
    public void binToDec(){
        if (binary.matches("[01]+")){
            int decimal = Integer.parseInt(binary, 2);

            System.err.println(binary+" = "+decimal);
        } else {
            System.out.println("Invalid input, only 0 and 1 are allowed!");
        }
    }
    public void decToBin(){
        String output = Integer.toBinaryString(decimal);
        System.err.println(decimal+" = "+output);
    }
}

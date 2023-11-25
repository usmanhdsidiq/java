/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpleconverter;

/**
 *
 * @author usman
 */
public class Length {
    public double value;

    public double equals;

    public String unitA;
    public String unitB;

    //getter
    public double getValue(){
        return value;
    }

    public double getEquals(){
        return equals;
    }

    public String getUnitA(){
        return unitA;
    }
    public String getUnitB(){
        return unitB;
    }
    
    //setter
    public void setValue(double newValue){
        this.value = newValue;
    }

    public void setEquals(double newEquals){
        this.equals = newEquals;
    }

    public void setUnitA(String newString){
        this.unitA = newString;
    }
    public void setUnitB(String newString){
        this.unitB = newString;
    }

    //general classes
    public void output(){
        System.err.println(value+" "+unitA+" = "+equals+" "+unitB);
    }
}

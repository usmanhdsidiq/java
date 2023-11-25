/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpleconverter;

/**
 *
 * @author usman
 */

import java.util.Scanner;

public class Temperature {
    Scanner input = new Scanner(System.in);
    
    public float value;
    private double equalFahrenheit;
    private double equalKelvin;
    private double equalReamur;
    private double equalRankine;
    private double equalCelcius;
    
    //getter
    public float getValue(){
        return value;
    }
    public double getEqualFahrenheit(){
        return equalFahrenheit;
    }
    public double getEqualKelvin(){
        return equalKelvin;
    }
    public double getEqualReamur(){
        return equalReamur;
    }
    public double getEqualRankine(){
        return equalRankine;
    }
    public double getEqualCelcius(){
        return equalCelcius;
    }
    
    //setter
    public void setValue(float newValue){
        this.value = newValue;
    }
    public void setEqualFahrenheit(double newEqual){
        this.equalFahrenheit = newEqual;
    }
    public void setEqualKelvin(double newEqual){
        this.equalKelvin = newEqual;
    }
    public void setEqualReamur(double newEqual){
        this.equalReamur = newEqual;
    }
    public void setEqualRankine(double newEqual){
        this.equalRankine = newEqual;
    }
    public void setEqualCelcius(double newEqual){
        this.equalCelcius = newEqual;
    }
    
    //general classes
    public void fahrenheit(){
        equalCelcius = (value - 32) * 5/9;
        equalKelvin = (value + 459.67) * 5/9;
        equalReamur = (value - 32) * 4/9;
        equalRankine = value + 459.67;
        
        System.out.println("The input value is "+value+"(deg) Fahrenheit");
        System.out.println("The outputs value is: ");
        System.out.println(equalCelcius+"(deg) Celcius");
        System.out.println(equalKelvin+" Kelvin");
        System.out.println(equalReamur+"(deg) Reamur");
        System.out.println(equalRankine+"(deg) Rankine");
    }
    public void celcius(){
        equalFahrenheit = 1.8 * value + 32;
        equalKelvin = value + 273.15;
        equalReamur = (4/5) * value;
        equalRankine = (value + 273.15) * (9/5);
        
        System.out.println("The input value is "+value+"(deg) Celcius");
        System.out.println("The outputs value is: ");
        System.out.println(equalFahrenheit+"(deg) Fahrenheit");
        System.out.println(equalKelvin+" Kelvin");
        System.out.println(equalReamur+"(deg) Reamur");
        System.out.println(equalRankine+"(deg) Rankine");
    }
    public void kelvin(){
        equalFahrenheit = (value * (9/5)) - 459.67;
        equalCelcius = value - 273.15;
        equalReamur = (value - 273) * 4/5;
        equalRankine = value * 9/5;
        
        System.out.println("The input value is "+value+"Kelvin");
        System.out.println("The outputs value is: ");
        System.out.println(equalFahrenheit+"(deg) Fahrenheit");
        System.out.println(equalCelcius+"(deg) Celcius");
        System.out.println(equalReamur+"(deg) Reamur");
        System.out.println(equalRankine+"(deg) Rankine");
    }
    public void reamur(){
        equalFahrenheit = (value * 2.25) + 32;
        equalCelcius = value / 0.8;
        equalKelvin = (value / 0.8) + 273.15;
        equalRankine = (value * 2.25) + 491.67;
        
        System.out.println("The input value is "+value+"(deg) Reamur");
        System.out.println("The outputs value is: ");
        System.out.println(equalFahrenheit+"(deg) Fahrenheit");
        System.out.println(equalCelcius+"(deg) Celcius");
        System.out.println(equalKelvin+" Kelvin");
        System.out.println(equalRankine+"(deg) Rankine");
    }
    public void rankine(){
        equalFahrenheit = value - 459.67;
        equalCelcius = (value - 491.67) * 5/9;
        equalKelvin = value * 5/9;
        equalReamur = (value / 1.8 + 273.15) * 0.8;
        
        System.out.println("The input value is "+value+"(deg) Rankine");
        System.out.println("The outputs value is: ");
        System.out.println(equalFahrenheit+"(deg) Fahrenheit");
        System.out.println(equalCelcius+"(deg) Celcius");
        System.out.println(equalKelvin+" Kelvin");
        System.out.println(equalReamur+"(deg) Reamur");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleconverter;

/**
 * @author usman
 */

import java.util.Scanner;

public class SimpleConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Converter");
        System.out.println("Based on: Java");
        System.out.println("====================================");
        System.out.println("Please choose a menu: ");
        System.out.println("1. Temperature");
        System.out.println("2. Length");
        System.out.println("3. Numeral System");
        System.out.println("4. Factorial Calculator");
        System.out.println();
        System.out.print("Choice: ");

        try {
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    //temperature
                    System.out.println("Temperature");

                    try {
                        System.out.print("Please enter the value: ");
                        float value = input.nextFloat();

                        Temperature temp = new Temperature();
                        temp.value = value;

                        System.out.println(temp.value);

                        System.out.println("Please choose the input's unit (none=celcius)");
                        System.out.println("1. Fahrenheit");
                        System.out.println("2. Celcius");
                        System.out.println("3. Kelvin");
                        System.out.println("4. Reamur");
                        System.out.println("5. Rankine");
                        System.out.print("Choice: ");

                        try {
                            int unit = input.nextInt();

                            switch (unit) {
                                case 1:
                                    //fahrenheit
                                    temp.fahrenheit();
                                    break;
                                case 2:
                                    //celcius
                                    temp.celcius();
                                    break;
                                case 3:
                                    //kelvin
                                    temp.kelvin();
                                    break;
                                case 4:
                                    //reamur
                                    temp.reamur();
                                    break;
                                case 5:
                                    //rankine
                                    temp.rankine();
                                    break;
                                default:
                                    //the default is Celcius
                                    temp.celcius();
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("ERROR: make sure you have enter numerical only for choosing the menu");
                        }


                    } catch (Exception e) {
                        System.out.println("ERROR: invalid input.");
                    }
                    break;
                case 2:
                    //length
                    System.out.println("Length");

                    try {
                        System.out.print("Please enter the value: ");
                        double value = input.nextDouble();

                        Length length = new Length();
                        length.value = value;

                        System.out.println("Please enter the current unit");
                        System.out.println("1. Milimeters (mm)");
                        System.out.println("2. Centimeters (cm)");
                        System.out.println("3. Meters (m)");
                        System.out.println("4. Kilometers (km)");
                        System.out.println("5. Mile");
                        System.out.println("7. Light year");

                        try {
                            System.out.print("Choose: ");
                            int unit = input.nextInt();

                            switch (unit) {
                                case 1:
                                    //milimeters
                                    length.setUnitA("mm");

                                    System.out.println("Please choose the destination unit");
                                    System.out.println("1. Centimeters (cm)");
                                    System.out.println("2. Meters (m)");
                                    System.out.println("3. Kilometers (km)");

                                    try {
                                        System.out.print("Choose: ");
                                        int unitX = input.nextInt();

                                        switch (unitX) {
                                            case 1:
                                                //centimeters
                                                length.setUnitB("cm");
                                                length.setEquals(value / 10);
                                                length.output();
                                                break;
                                            case 2:
                                                //meters
                                                length.setUnitB("m");
                                                length.setEquals(value / 1000);
                                                length.output();
                                                break;
                                            case 3:
                                                //kilometers
                                                length.setUnitB("km");
                                                length.setEquals(value / 1000000);
                                                length.output();
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("ERROR: Invalid input");
                                    }
                                    break;
                                case 2:
                                    //centimeters
                                    length.setUnitA("cm");

                                    System.out.println("Please choose the destination unit");
                                    System.out.println("1. Milimeters (mm)");
                                    System.out.println("2. Meters (m)");
                                    System.out.println("3. Kilometers (km)");

                                    try {
                                        System.out.print("Choose: ");
                                        int unitX = input.nextInt();

                                        switch (unitX) {
                                            case 1:
                                                //milimeters
                                                length.setUnitB("mm");
                                                length.setEquals(value * 10);
                                                length.output();
                                                break;
                                            case 2:
                                                //meters
                                                length.setUnitB("m");
                                                length.setEquals(value / 100);
                                                length.output();
                                                break;
                                            case 3:
                                                //kilometers
                                                length.setUnitB("km");
                                                length.setEquals(value / 100000);
                                                length.output();
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("ERROR: Invalid input");
                                    }
                                    break;
                                case 3:
                                    //meters
                                    length.setUnitA("m");

                                    System.out.println("Please choose the destination unit");
                                    System.out.println("1. Milimeters (mm)");
                                    System.out.println("2. Centimeters (cm)");
                                    System.out.println("3. Kilometers (km)");

                                    try {
                                        System.out.print("Choose: ");
                                        int unitX = input.nextInt();

                                        switch (unitX) {
                                            case 1:
                                                //milimeters
                                                length.setUnitB("mm");
                                                length.setEquals(value * 1000);
                                                length.output();
                                                break;
                                            case 2:
                                                //centimeters
                                                length.setUnitB("cm");
                                                length.setEquals(value * 100);
                                                length.output();
                                                break;
                                            case 3:
                                                //kilometers
                                                length.setUnitB("km");
                                                length.setEquals(value / 1000);
                                                length.output();
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("ERROR: Invalid input");
                                    }
                                    break;
                                case 4:
                                    //kilometers
                                    length.setUnitA("km");

                                    System.out.println("Please choose the destination unit");
                                    System.out.println("1. Milimeters (mm)");
                                    System.out.println("2. Centimeters (cm)");
                                    System.out.println("3. Meters (m)");
                                    System.out.println("4. Miles");

                                    try {
                                        System.out.print("Choose: ");
                                        int unitX = input.nextInt();

                                        switch (unitX) {
                                            case 1:
                                                //milimeters
                                                length.setUnitB("mm");
                                                length.setEquals(value * 1000000);
                                                length.output();
                                                break;
                                            case 2:
                                                //centimeters
                                                length.setUnitB("cm");
                                                length.setEquals(value * 100000);
                                                length.output();
                                                break;
                                            case 3:
                                                //meters
                                                length.setUnitB("m");
                                                length.setEquals(value * 1000);
                                                length.output();
                                                break;
                                            case 4:
                                                //miles
                                                length.setUnitB("miles");
                                                length.setEquals(value / 1.6);
                                                length.output();
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("ERROR: Invalid input");
                                    }
                                    break;
                                case 5:
                                    //mile
                                    length.setUnitA("mile");

                                    System.out.println("Please choose the destination unit");
                                    System.out.println("1. Meters (m)");
                                    System.out.println("2. Kilometers (km)");

                                    try {
                                        System.out.print("Choose: ");
                                        int unitX = input.nextInt();

                                        switch (unitX) {
                                            case 1:
                                                //meters
                                                length.setUnitB("m");
                                                length.setEquals(value * 1609.3);
                                                length.output();
                                                break;
                                            case 2:
                                                //kilometers
                                                length.setUnitB("km");
                                                length.setEquals(value * 1.6);
                                                length.output();
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("ERROR: Invalid input");
                                    }
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("ERROR: Invalid input");
                        }
                    } catch (Exception e) {
                        System.out.println("ERROR: Invalid input");
                    }
                    break;
                case 3:
                    //data
                    System.out.println("Numerical System");

                    System.out.println("Please choose a menu below:");
                    System.out.println("1. Binary to Decimal");
                    System.out.println("2. Decimal to Binary");
                    System.out.println("---Coming soon---");

                    try{
                        System.out.print("Choose: ");
                        int unitX = input.nextInt();

                        Numeric num = new Numeric();

                        switch(unitX){
                            case 1:
                                System.out.println("Binary to Decimal");

                                input.nextLine();
                                System.out.print("Please enter the binary value: ");

                                num.binary = input.nextLine();

                                num.binToDec();
                                break;
                            case 2:
                                System.out.println("Decimal to Binary");
                                System.out.print("Please enter the decimal value: ");

                                num.decimal = input.nextInt();

                                num.decToBin();
                                break;
                                /// coming soon ///
                        }
                    } catch (Exception e) {
                        System.out.println("ERROR: "+e);
                    }
                    break;
                case 4:
                    //factorial calculator
                    System.out.println("Factorial Calculator");

                    Factorial fact = new Factorial();
                    try{
                        System.out.print("Please enter the value: ");
                        fact.number = input.nextInt();

                        fact.calc();
                    } catch (Exception e){
                        System.out.println("ERROR: "+e);
                    }
            }
        } catch (Exception e) {
            System.out.println("ERROR: make sure you have enter numerical only for choosing the menu");
            System.out.println("Please restart the app");

            System.out.println(e);
        }

    }
}

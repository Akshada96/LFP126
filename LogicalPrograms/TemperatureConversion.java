package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\nEnter your option (1 or 2) :");
        int n = sc.nextInt();
        if (n == 1){
            System.out.println("Enter the temperature in celsius :");
            float c = sc.nextFloat();
            CelToFahren(c);
        }
        else {
            System.out.println("Enter the temperature in fahrenheit :");
            float f = sc.nextFloat();
            FahrenToCel(f);
        }
    }
    public static void CelToFahren(float c){
        float f = (c*9/5)+32;
        System.out.println(c+"C is equals to "+f+"F");
    }
    public static void FahrenToCel(float f){
        float c = (f-32)*5/9;
        System.out.println(f+"F is equals to "+c+"C");
    }
}

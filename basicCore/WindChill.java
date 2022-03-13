package com.bridgelabz.basicCore;

import java.util.Scanner;

public class WindChill {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the temperature t in Fahrenheit : ");
            double t = sc.nextDouble();
            System.out.print("Enter the wind speed v in miles per hour : ");
            double v = sc.nextDouble();
            double w ;
            w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16);
            System.out.print("Wind chill is : "+w);
        }
}

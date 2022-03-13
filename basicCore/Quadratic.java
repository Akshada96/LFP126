package com.bridgelabz.basicCore;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a, b & c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = b*b-4*a*c;
        //System.out.println(delta);
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("Root 1 of x = "+root1);
        System.out.println("Root 2 of x = "+root2);

    }
}

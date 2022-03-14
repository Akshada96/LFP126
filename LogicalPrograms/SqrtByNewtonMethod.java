package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class SqrtByNewtonMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative no :");
        double c = sc.nextDouble();
        while (c<0){
            System.out.println("Enter positive no only :");
            c = sc.nextDouble();
        }
        sqrt(c);
    }

    public static void sqrt(double c){
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t-c/t) > epsilon*t){
            t = (c/t + t)/2;
        }
        System.out.println("Sqrt of "+c+" is "+t);
    }
}

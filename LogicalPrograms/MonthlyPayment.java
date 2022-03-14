package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount, tenure & rate of interest :");
        double p = sc.nextDouble();
        double y = sc.nextDouble();
        double rate = sc.nextDouble();
        monthlyPayment(p,y,rate);
    }

    public static void monthlyPayment(double p, double y, double rate){
        double n = 12*y;
        double r = rate/(12*100);
        double payment = p*r/(1-Math.pow((1+r),-n));
        //System.out.println("Monthly payments for "+y+" years to pay off a "+p+" principal loan amount at "+rate+" per cent interest compounded monthly is "+payment);
        System.out.println("Monthly payment is "+payment);
    }
}

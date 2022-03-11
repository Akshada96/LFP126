package com.bridgelabz.basicCore;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend : ");
        int x = sc.nextInt();
        System.out.print("Enter the divisor : ");
        int y = sc.nextInt();
        System.out.println("Quotient is : "+(x/y));
        System.out.println("Remainder is : "+(x%y));
    }
}

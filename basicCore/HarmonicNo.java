package com.bridgelabz.basicCore;

import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print : ");
        int n = sc.nextInt();
        float harmonic = 0.00F;
        for (int i = 1; i<=n; i++){
            harmonic=harmonic+(float) 1/i;
            System.out.println(i+"th Harmonic term is "+harmonic);
        }
   //     System.out.println(n+"th Harmonic term is "+harmonic);
    }

}

package com.bridgelabz.basicCore;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the prime factors : ");
        int n = sc.nextInt();
        System.out.print("Prime factors of "+n+" are : ");
        for (int i=2; i<=n; i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
    }
}

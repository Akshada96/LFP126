package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a prime no : ");
        int n = sc.nextInt();
        int isPrime = 1;
        for (int i=2 ; i<n ; i++){
            if(n%i == 0){
                isPrime=0;
                System.out.println(n+" is not a prime no");
                break;
            }
        }
        if (isPrime==1){
            System.out.println(n+" is a prime no");
        }
    }
}

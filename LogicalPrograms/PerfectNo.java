package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a perfect no. : ");
        int n = sc.nextInt();
       // int temp = n;
        int sum = 0;
        System.out.print("Prime divisors of "+n+" are : ");
        for (int i=1; i<n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                sum = sum + i;
                //n=n/i;
            }
        }
        System.out.println();
        if(sum==n){
            System.out.println(n+" is perfect no");
        }
        else {
            System.out.println(n+" is not a perfect no");
        }
    }
}

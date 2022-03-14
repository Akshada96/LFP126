package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of terms to print : ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Fibonacci Series is :");
        System.out.print(n1+" "+n2+" ");
        for (int i = 2; i < n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
    }
}

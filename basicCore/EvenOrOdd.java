package com.bridgelabz.basicCore;

import java.util.Scanner;

public class EvenOrOdd {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Entered number is Even");
        }
        else {
            System.out.println("Entered number is Odd");
        }
    }
}

package com.bridgelabz.basicCore;

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swapping");
        System.out.println("num1 is : "+num1);
        System.out.print("num2 is : "+num2);
    }
}

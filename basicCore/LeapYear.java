package com.bridgelabz.basicCore;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year=sc.nextInt();
        do {
            if(year<999 || year>10000){
                System.out.print("Enter proper 4 digit year : ");
                year=sc.nextInt();
            }
            else{
                break;
            }
        }
        while (true);
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Year "+year+" is a leap year");
        }
        else {
            System.out.println("Year "+year+" is not a leap year");
        }
    }
}

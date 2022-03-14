package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class Coupon {
    public static int randomNo(int n) {
        int randomNo = (int) (Math.random()*n);
        //System.out.println("Random no : "+randomNo);
        return randomNo;
    }

    static int count = 0;
    static int distinct = 0;

    public static void couponNo(int n) {
        boolean[] isNew = new boolean[n];
        while (distinct < n) {
            int num = randomNo(n);
            //System.out.println("No = "+num);
            count++;
            if (!isNew[num]) {
                distinct++;
                isNew[num] = true;
                //System.out.println("Distinct no : "+num);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a coupon number : ");
        int n = sc.nextInt();
        couponNo(n);
        System.out.println("Total random no needed are "+count);
    }
}

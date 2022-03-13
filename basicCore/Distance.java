package com.bridgelabz.basicCore;

import java.util.Scanner;


public class Distance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x co-ordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter the y co-ordinate : ");
        int y = sc.nextInt();
        double distanace = Math.pow(x*x+y*y,0.5);
        System.out.println("Euclidean distance from the point ("+x+","+y+") to the origin (0, 0) is "+distanace);
    }
}

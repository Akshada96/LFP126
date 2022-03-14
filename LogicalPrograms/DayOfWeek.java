package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day (1-31) : ");
        int d = sc.nextInt();
        while (d<1 || d>31){
            System.out.println("Enter day between 1 to 31 :");
            d = sc.nextInt();
        }
        System.out.println("Enter Month (1-12) : ");
        int m = sc.nextInt();
        while (m<1 || m>12){
            System.out.println("Enter month between 1 to 12 :");
            m = sc.nextInt();
        }
        System.out.println("Enter year : ");
        int y = sc.nextInt();
        dayOfWeek(d,m,y);
    }

    public static void dayOfWeek(int d, int m, int y){
        int y0 = y-(14-m)/12;
        int x = y0+(y0/4)-(y0/100)+(y0/400);
        int m0 = m+12*((14-m)/12)-2;
        int d0 = (d+x+31*m0/12)%7;
        //System.out.println("d0 = "+d0);
        switch (d0) {
            case 0 -> System.out.println("Day of the week on "+d+"/"+m+"/"+y+" is Sunday");
            case 1 -> System.out.println("Day of the week on "+d+"/"+m+"/"+y+" is Monday");
            case 2 -> System.out.println("Day of the week on "+d+"/"+m+"/"+y+" is Tuesday");
            case 3 -> System.out.println("Day of the week on "+d+"/"+m+"/"+y+" is Wednesday");
            case 4 -> System.out.println("Day of the week on "+d+"/"+m+"/"+y+" is Thursday");
            case 5 -> System.out.println("Day of the week on "+d+"/"+m+"/"+y+" is Friday");
            case 6 -> System.out.println("Day of the week on "+d+"/"+m+"/"+y+" is Saturday");
        }
    }
}

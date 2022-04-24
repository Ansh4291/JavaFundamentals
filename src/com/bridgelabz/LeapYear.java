package com.bridgelabz;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {

        int year = 0;

        System.out.println("Enter a year:- ");

        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();

        if(((year %4 == 0 ) && (year % 100 != 0)) || (year % 400 == 0))

            System.out.println(" Year is a Leap Year");

        else

            System.out.println(" Year is not a Leap Year");

    }
}

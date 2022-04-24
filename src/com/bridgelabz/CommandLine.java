package com.bridgelabz;

import java.util.Scanner;

public class CommandLine {
    public static void main(String args[])
    {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name ");
        s1 = sc.nextLine();
        System.out.println("Your first argument is:"+ s1);
    }
}

package org.example;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Please Enter Your age : ");
        int age=s.nextInt();
        if(age>=18)
            System.out.println("you are eligible to voting!!!");
        else
            System.out.println("you are not eligible to voting!!!");
    }
}
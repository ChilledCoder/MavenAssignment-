package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stringrevers obj= new Stringrevers();

        Scanner sc = new Scanner(System.in);

        String StringInput=sc.nextLine();

        System.out.println(obj.getStringLength(StringInput));
        System.out.println(obj.reverseString(StringInput));
    }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String str1;
        str1 = scanner.nextLine();
        char letter = str1.charAt(str1.length() - 1);
        System.out.println(letter);
    }
}
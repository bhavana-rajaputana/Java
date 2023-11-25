package com.bhavana;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.print("Enter name:");
        String name = scanner.nextLine().trim();
        System.out.println("name is:"+name);


        System.out.println("Enter age:");
        byte age =scanner.nextByte();
        System.out.println("Age:"+age);
        if (age>18)
            System.out.println("Heyooo");
        else
            System.out.println("Dementor!!!");
    }

    public static class Main {
    }
}

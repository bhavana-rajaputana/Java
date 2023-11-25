package com.bhavana;

public class string {
    public static void main(String[] args) {
        String message="Hello World"+"!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.indexOf("weee"));
        System.out.println(message.replace("!","#"));
        System.out.println(message.charAt(0));
        System.out.println(message.toLowerCase());
        String name="  Hey  ";
        System.out.println(name.trim());

        //spl chars

        String message1="hello \"Bhavana\"";
        System.out.println(message1); // \\,\n,\",\t
    }
}


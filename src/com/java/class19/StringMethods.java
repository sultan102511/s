package com.java.class19;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        //1. Change Case of String
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //2. Equality of String
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //3.Ignore Case of String
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        //4. Contains
        String str4 = "Hello Sultan, Welcome to Amazon";
        System.out.println(str4.contains(str1));//true
        System.out.println(str4.toLowerCase().contains(str3.toLowerCase())); //true

        //5. Character at Particular Index
        System.out.println(str4.charAt(6));

        //6.  Index of Particular character
        System.out.println(str4.indexOf("A"));

        //7. Length of the String
        System.out.println(str4.length());

        //8. Check if String is empty
        String str5 = " ";
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());

        //9. Trim - trimming spaces before and after String
        String str6 = "       Hello    World";
        System.out.println(str6.trim());

        //10. SubString
        String str7 = "banana";
        System.out.println(str7.substring(2,4));

        // 11. Format
        String title = "Hello %s, Welcome to %s";
        String user = "Chirag";
        String website = "Amazon";
        System.out.println(String.format(title,user,website));

        // 12. Replace
        String title1 = "Hello ZZZ, Welcome to $$$";
        title1 = title1.replace("ZZZ", user);
        System.out.println(title1.replace("ZZZ", user));
        System.out.println(title1.replace("$$$", website));
        System.out.println(title1.replace("$$$", website).replace("ZZZ", user));
        // replaceAll() - We will learn this one once we cover the regular expression

        // 13. Split
        String title2 = "Hello User , Welcome to Ebay";
        String words[]  =    title2.split(" ");
        System.out.println(words.length);
    }
}

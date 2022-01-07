package com.company;
/*
In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. For example:

char[] ch={'j','a','v','a','t','p','o','i','n','t'};
String s=new String(ch);
is same as:
String s="javatpoint";
#String are IMMUTABLE in Java
How to create a string object?
There are two ways to create String object:
1.By string literal
2.By new keyword
-> Note: String objects are stored in a special memory area known as the "string constant pool".

*/


public class StringClass {
    public static void stringImmutableExample()
    {
        String s1 = new String("This is original string");
        String s2 = new String("This is original string");
        s2="Hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.charAt(0));
    }
}

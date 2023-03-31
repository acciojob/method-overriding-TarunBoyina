package com.driver;

public class Main {
    public static void main(String[]args){
B obj = new B();
String result1 = obj.meth();
String result =((A)obj).meth();
System.out.println(result1);
        System.out.println(result);

    }
}
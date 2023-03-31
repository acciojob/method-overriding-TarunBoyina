package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

  class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String result1 = obj.meth();
        String result2 = ((A) obj).meth();
        System.out.println(result1);  // Output: "Method is overridden in Extended class B"
        System.out.println(result2);  // Output: "Invoking method from class A"
    }
}
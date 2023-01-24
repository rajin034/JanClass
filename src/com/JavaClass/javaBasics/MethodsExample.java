package com.JavaClass.javaBasics;

public class MethodsExample {
    int n ;
    int m ;

    public int add(){
        return n+m;
    }
    public int substract(){
        return n-m;
    }
    public int multiply(){
        return n*m;
    }
    public double divide(){
        return n/m;
    }

    public static void main(String[] args) {
        MethodsExample myobj = new MethodsExample();
        myobj.n = 10;
        myobj.m =5;
        System.out.println(myobj.add());
    }
}

package com.company.lab5;

public class A {
    protected String a;
    protected X x=new X ("xxx");

    public A(String a) {
        this.a = a;
    }

//    public A() {
//    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

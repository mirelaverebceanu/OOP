package com.company.lab5;

public class C extends B {
    protected String c;

    public C(String c) {
        super("b1");
        this.c = c;
    }


    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

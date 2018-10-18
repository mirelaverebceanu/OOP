package com.company.lab5;

public class B extends A{
    protected String b;
//
//    public B(String a, String b) {
//        super(a);
//        this.b = b;
//    }

    public B(String b) {
        super ("a1");
        this.b = b;
    }
//


    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

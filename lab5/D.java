package com.company.lab5;

public class D extends C{
   protected  String d;
   protected X x=new X("x2");
//
//    public D(String a, String b, String c, String d) {
//        super(a, b, c);
//        this.d = d;
//    }

//    public D(String b, String c, String d) {
//        super(b, c);
//        this.d = d;
//    }

    public D(String d) {
        super("c1");
        this.d=d;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

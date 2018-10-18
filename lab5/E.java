package com.company.lab5;

public class E extends D{
    protected String e;

//    public E(String a, String b, String c, String d, String e) {
//        super(a, b, c, d);
//        this.e = e;
//    }
//
//    public E(String b, String c, String d, String e) {
//        super(b, c, d);
//        this.e = e;
//    }

    public E(String e){
        super("d1");
        this.e=e;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

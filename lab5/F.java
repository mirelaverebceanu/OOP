package com.company.lab5;

public class F extends E{
    protected String f;

//    public F(String a, String b, String c, String d, String e, String f) {
//        super(a, b, c, d, e);
//        this.f = f;
//    }
//
//    public F(String b, String c, String d, String e, String f) {
//        super(b, c, d, e);
//        this.f = f;
//    }

    public F(String f){
        super("e1");
        this.f=f;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

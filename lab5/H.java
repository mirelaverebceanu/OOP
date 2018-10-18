package com.company.lab5;

public class H extends G {
    protected String h;
    private X x=new X ("x3");


//    public H(String a, String b, String c, String d, String e, String f, String g, String h) {
//        super(a, b, c, d, e, f, g);
//        this.h = h;
//    }
//
//    public H(String b, String c, String d, String e, String f, String g, String h) {
//        super(b, c, d, e, f, g);
//        this.h = h;
//    }

    public H(String h){
        super("h1");
        this.h=h;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

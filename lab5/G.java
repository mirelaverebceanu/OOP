package com.company.lab5;

public class G extends F {
    protected String g;
//
//    public G(String a, String b, String c, String d, String e, String f, String g) {
//        super(a, b, c, d, e, f);
//        this.g = g;
//    }
//
//    public G(String b, String c, String d, String e, String f, String g) {
//        super(b, c, d, e, f);
//        this.g = g;
//    }

    public G (String g){
        super("f1");
        this.g=g;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
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

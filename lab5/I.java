package com.company.lab5;
import java.lang.reflect.Field;

public class I extends H {
    protected String i;
    protected X x=new X ("x4");


//    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
//        super(a, b, c, d, e, f, g, h);
//        this.i = i;
//    }
//
//    public I(String b, String c, String d, String e, String f, String g, String h, String i) {
//        super(b, c, d, e, f, g, h);
//        this.i = i;
//    }
    public I (String i){
        super("h1");
        this.i=i;
    }

//    public int geta(){
//        Field field;
//        int x = 0;
//        try {
//            field = H.class.getDeclaredField("x4");
//            field.setAccessible(true);
//            x = field.getInt(this.h);
//        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.println(x);
//        return x;
//    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
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

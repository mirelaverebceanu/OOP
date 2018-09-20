package com.company.lab1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Monitor monitor1=new Monitor();

        monitor1.culoare="negru";
        monitor1.dimensiune=16.6f;
        monitor1.rezolutie="1024x768";

        Monitor monitor2=new Monitor();

        monitor2.culoare="gri";
        monitor2.dimensiune=16.6f;
        monitor2.rezolutie="800x768";

        System.out.println(monitor1 == monitor2);
        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.culoare.equals( monitor2.culoare));
        System.out.println(monitor1.dimensiune == monitor2.dimensiune);
        System.out.println(monitor1.rezolutie.equals( monitor2.rezolutie));

        monitor2.culoare="alb";
        System.out.println(monitor1.culoare.equals( monitor2.culoare));

        monitor2.changedimension(22f);
        monitor2.print();

        monitor1.comparare(monitor2);
        monitor1.changedimension(22f);
        monitor1.comparare(monitor2);

    }
}

class Monitor {
    String culoare;
    float dimensiune;
    String rezolutie;

    void changedimension (float dimensiune){
        this.dimensiune=dimensiune;
    }

    void print(){
        System.out.println("Monitor"+":"+culoare+","+dimensiune+","+rezolutie);
    }

    void comparare (Monitor monitor){

        if (this.dimensiune == monitor.dimensiune){
            System.out.println("Monitoarele au dimensiuni egale");
        }
        else {
            System.out.println("Monitoarele au dimensiuni diferite");
        }

    }

    }

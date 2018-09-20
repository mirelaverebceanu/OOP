package com.company.lab2;

import java.util.Scanner;
import java.util.Random;

public class mainl2 {

    public static void main(String[] args) {

        Cub cub1=new Cub();

        cub1.aria();
        System.out.print("Aria.cub1="+cub1.aria()+"\n");
        cub1.volume();
        System.out.print("Volume.cub1="+cub1.volume()+"\n");

        Cub cub2=new Cub(2);

        cub2.aria();
        System.out.print("Aria.cub2="+cub2.aria()+"\n");
        cub2.volume();
        System.out.print("Volume.cub2="+cub2.volume()+"\n");

        Cub cub3=new Cub (3,3,3);

        cub3.aria();
        System.out.print("Aria.cub3="+cub3.aria()+"\n");
        cub3.volume();
        System.out.print("Volume.cub3="+cub3.volume()+"\n");

        System.out.print("\nTask number 2 :\n");
        System.out.print("\nEnqueue elements :\n");

        Queue queue2 = new Queue(10);

        Random rand = new Random();
        for (int i=0; i< 10; i++){
            int n = rand.nextInt(50) + 1;
            queue2.add(n);
        }

        queue2.showListnr();

        queue2.isFull();

        System.out.print("\nDequeue element :\n");

        queue2.remove();
        queue2.showNewList();
        queue2.isEmpty();


    }
}

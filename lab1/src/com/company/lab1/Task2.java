package com.company.lab1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        float sum=0.0f;
        int count=0;
        float avg;

        Scanner scanner = new Scanner(System.in);

        Universitate universitate[] = new Universitate[3];

        for (int j = 0; j < 3; j++) {

            float s=0.0f;
            int c=0;
            float a;


            universitate[j]=new Universitate();
            scanner.nextLine();

            System.out.println("Enter the name of "+(j+1)+" university:");
            universitate[j].name = scanner.nextLine();
            System.out.println(universitate[j].name);

            System.out.println("Enter the foundation year:");
            universitate[j].foundationYear = scanner.nextInt();
            System.out.println(universitate[j].foundationYear);

            System.out.println("Enter the number of students:");
            int n = scanner.nextInt();
            System.out.println(n);


            Student student[] = new Student[n];

            for (int i = 0; i < n; i++) {

                scanner.nextLine();

                student[i] = new Student();

                System.out.println("Enter the name of " + (i + 1) + " student:");
                student[i].name = scanner.nextLine();
                System.out.println(student[i].name);

                System.out.println("Enter the age of " + (i + 1) + " student:");
                student[i].age = scanner.nextInt();
                System.out.println(student[i].age);

                System.out.println("Enter the mark of " + (i + 1) + " student:");
                student[i].mark = scanner.nextFloat();
                System.out.println(student[i].mark);

                s=s+student[i].mark;
                c++;

            }

            System.out.println("Sum:"+s);
            System.out.println("Count:"+c);
             a=s/c;
            System.out.println("Average:"+a);

            sum=sum+s;
            count++;

        }

        System.out.println("\nSum of all marks:"+sum);
        System.out.println("Count:"+count);
        avg=sum/count;
        System.out.println("Average in all Universities:"+avg);

        }

    }

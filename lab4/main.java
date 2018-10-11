package com.company.lab4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.nio.file.Files.*;

public class main {
    public static void main(String[] args) throws IOException {

        String content;

        content = new String(readAllBytes(Paths.get("D:\\Java\\src\\com\\company\\lab4\\one_expression.txt")));
        Stack mySt= new Stack();

        System.out.println(content);

     //   String [] chars = content.split("");
        char[] chars=content.toCharArray();
        char tail=' ';
     //   System.out.println(Arrays.toString(chars));

        for (int i=0; i<chars.length; i++) {
            if (chars[i] == '(') {
                mySt.push(chars[i]);
                tail=chars[i];
                System.out.println("The ( is open");
            }
            else if (chars[i]==')'){
                System.out.println("the ) is close");
                if (mySt.isEmpty()){
                    System.out.println("Wrong");
                    mySt.push(chars[i]);
                    tail=chars[i];
                }
               else{
                   if(tail=='(') {
                       mySt.pop();
                   }
               }
            }
        }



        if (mySt.isEmpty()){
            System.out.println("The expression is correct");
        }
        else {
            System.out.println("The expression is wrong");
        }
    }

}

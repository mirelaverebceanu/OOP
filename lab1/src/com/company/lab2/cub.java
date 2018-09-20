package com.company.lab2;

 class Cub {
     private double height, width, length;

     public Cub(){
         height=1;
         width=1;
         length=1;
     }

     public Cub(double newValue){
         height=newValue;
         width=newValue;
         length=newValue;
     }

     Cub(double height, double width, double length) {

         this.height = height;
         this.width=width;
         this.length=length;
     }

     double aria(){

         return 2*height+2*width+2*length;

     }

     double volume(){

         return height*width*length;
     }


 }

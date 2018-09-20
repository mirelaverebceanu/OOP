package com.company.lab2;

public class Queue {

    private int[] listnr;
    private int[] newlist;
    private int nrelem;
    private int i=0;

    Queue(){

         nrelem=10;
         listnr=new int[nrelem];
    }

    Queue(int nrelem){

        this.nrelem=nrelem;
        listnr=new int[nrelem];
    }

    public void add(int n){
            listnr[i] = n;
            i++;
    }

    void showListnr(){
        for (int element:listnr) {
            System.out.print(element+", ");
        }
    }

    void remove (){
        int n=listnr.length-1;
        newlist=new int[n];
        System.arraycopy(listnr,1,newlist,0,n);
    }

    void showNewList(){
        for (int element:newlist) {
            System.out.print(element+", ");
        }
    }

    public void isFull(){
        if (listnr.length==10) {
            System.out.print("\nThe queue is Full\n");
        }
    }

    public void isEmpty(){
        if (listnr.length==0){
            System.out.print("\nThe queue is Empty\n");
        }
    }


}

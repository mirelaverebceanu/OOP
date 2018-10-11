package com.company.lab4;


class Node{
    Node next;
    char data;

    Node(char data) {
      this.data=data;
    }
}


public class Stack {
    private int i=0;
    private Node head=null;
    private int size=0;

    public void push(char n)
    {
       if(head==null){
           head=new Node(n);
       }
       else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next=new Node(n);
       }
       size++;
    }

    public char pop()
    {
        if(head==null){
            System.out.println("Warning");
        }
        else {
            if(head.next==null){
                char data = head.data;
                head=null;
                size--;
                return data;
            }
            else{
                Node tmp = head;
                while(tmp.next!=null){
                    tmp = tmp.next;
                }
                char data=tmp.data;
                tmp=null;
                size--;
                return data;
            }

        }
        return ' ';
    }
     boolean isEmpty(){
        return size==0;
     }
}


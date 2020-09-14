package org.manicpromod.crackingcoding.queue;

/**
 * Created by pmanickam on 8/25/2020 at 4:48 PM
 */
public class MyQueue {

    public static class Queue{

        int data;
        Queue next;

    }

    private Queue first;
    private Queue last;

    public void enQueue(int data){

        Queue oneItem = new Queue();
        oneItem.data = data;
        last.next = oneItem;
        last = oneItem;

    }

    public int deQueue() throws Exception {

        if(first !=null){

            int data  = first.data;
            first = first.next;

            return data;

        } else {

            throw new Exception();
        }

    }

    public static void main(String[] args){

        Queue queue = new Queue();


    }

}

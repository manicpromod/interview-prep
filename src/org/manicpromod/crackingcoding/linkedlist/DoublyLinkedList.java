package org.manicpromod.crackingcoding.linkedlist;

import java.awt.desktop.AppReopenedEvent;

/**
 * Created by pmanickam on 8/22/2020 at 4:44 PM
 */
public class DoublyLinkedList {

    public static class DNode{

        int data;
        DNode next = null;
        DNode prev = null;

        public DNode(){
            this.data= data;
            this.prev = prev;
            this.next = next;
        }

    }

    public static void addAtHeadNode(DNode head, int data){

        DNode temp = new DNode();
        temp.data = data;
        if(head!= null){
            temp.next = head;
            head = temp;
            temp.prev = null;
        } else {

            temp.next = null;
            temp.prev = null;
        }


    }


    public static void main(String[] args){

        DNode dNode = new DNode();


    }


}

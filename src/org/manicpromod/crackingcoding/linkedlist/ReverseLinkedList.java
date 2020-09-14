package org.manicpromod.crackingcoding.linkedlist;

import static org.manicpromod.crackingcoding.linkedlist.DeleteNode.addNode;
import static org.manicpromod.crackingcoding.linkedlist.DeleteNode.traverse;

/**
 * Created by pmanickam on 8/3/2020 at 8:14 AM
 */
public class ReverseLinkedList {

    public static CreateLinkedList.Node revereseLinkedList(CreateLinkedList.Node head){

        CreateLinkedList.Node current = head;
        CreateLinkedList.Node nextNode = null;
        CreateLinkedList.Node prev = null;

        while(current.next != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }


        return current;

    }

    public static void  main(String[] args){

        CreateLinkedList.Node head = new CreateLinkedList.Node(10);
        addNode(head,20);
        addNode(head,30);
        addNode(head,40);
        addNode(head,50);
        traverse(head);
        traverse(revereseLinkedList(head));
    }

    public static void  reverseRecursion(CreateLinkedList.Node head){
        CreateLinkedList.Node current = head;
        if(current.next == null) {
            return ;
        }
        reverseRecursion(current.next);
        CreateLinkedList.Node temp = current.next;
         temp.next = current;
         current.next = null;

    }

}

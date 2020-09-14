package org.manicpromod.crackingcoding.linkedlist;

import static org.manicpromod.crackingcoding.linkedlist.DeleteNode.addNode;
import static org.manicpromod.crackingcoding.linkedlist.DeleteNode.traverse;

/**
 * Created by pmanickam on 8/21/2020 at 4:31 PM
 */
public class InsertNPositionLinkedList {

    public static CreateLinkedList.Node insertNthPosition(CreateLinkedList.Node head, int data, int pos) {
        int count = 1;
        CreateLinkedList.Node top  = head;
        CreateLinkedList.Node prev  = null;
        CreateLinkedList.Node temp = new CreateLinkedList.Node(data);
        if(head == null){
            return null;
        }
        if(pos == 1) {
            temp.next = head;
            head = temp;
            return head;
        }
        while(head != null) {
            if(count == pos) {
                prev.next = temp;
                temp.next = head;
                return top;
            } else {
                prev = head;
                head = head.next;
                count++;
            }
        }

        return top;

    }


    public static void main(String[] args) {

        CreateLinkedList.Node head = new CreateLinkedList.Node(10);
        addNode(head,20);
        addNode(head,30);
        addNode(head,40);
        addNode(head,50);
        traverse(head);
        System.out.println("   Below inserted values");
        traverse(insertNthPosition(head,2222,6));

    }

}

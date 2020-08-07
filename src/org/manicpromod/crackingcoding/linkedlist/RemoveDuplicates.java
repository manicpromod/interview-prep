package org.manicpromod.crackingcoding.linkedlist;

import java.util.HashSet;
import java.util.Set;

import static org.manicpromod.crackingcoding.linkedlist.DeleteNode.addNode;
import static org.manicpromod.crackingcoding.linkedlist.DeleteNode.traverse;

/**
 * Created by pmanickam on 7/30/2020 at 2:35 PM
 */
public class RemoveDuplicates {

    public static CreateLinkedList.Node deleteDup(CreateLinkedList.Node head) {

        CreateLinkedList.Node prev = head;
        CreateLinkedList.Node baseHead = head;
        Set set = new HashSet();

        while (head != null) {

            if (set.contains(head.data)) {

                prev.next = head.next;

            } else {

                set.add(head.data);
                prev = head;
            }


            head = head.next;


        }
        return baseHead;
    }

    public CreateLinkedList.Node deleteDupRunner(CreateLinkedList.Node head){

        CreateLinkedList.Node current = head;

        while (current != null){

            CreateLinkedList.Node runner = current;

            while(runner.next != null){

                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                } else {

                    runner = runner.next;
                }

            }
            current = current.next;

        }

        return head;

    }

    public static void main(String[] args) {

        CreateLinkedList.Node head = new CreateLinkedList.Node(40);

        addNode(head,20);
        addNode(head,10);
        addNode(head,40);
        addNode(head,50);
        addNode(head,10);
        addNode(head,60);
        traverse(head);
        System.out.println();
        System.out.println("Traversing the values");
        traverse(deleteDup(head));
    }

}

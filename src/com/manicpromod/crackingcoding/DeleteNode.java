package com.manicpromod.crackingcoding;

/**
 * Created by pmanickam on 7/30/2020 at 10:54 AM
 */
public class DeleteNode {

    public CreateLinkedList.Node deleteNode(CreateLinkedList.Node head, int data) {

        if(head.data == data) return head;

        while(head.next != null)
        {
            if(head.next.data == data) {
                head.next = head.next.next;
                return head;
            }
            head = head.next;
        }
        return head;
    }

    public static void addNode(CreateLinkedList.Node head, int data) {

        CreateLinkedList.Node node = new CreateLinkedList.Node(data);

        while(head.next != null) {

            head = head.next;
        }

        head.next = node;
        System.out.println(head.data +" node is added");
    }

    public static void traverse(CreateLinkedList.Node head){

        while(head.next != null) {

            System.out.print(head.data);
            System.out.print("-->");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        CreateLinkedList.Node head = new CreateLinkedList.Node(10);

        addNode(head,20);
        addNode(head,30);
        addNode(head,40);
        addNode(head,50);

        System.out.println("Traversing the values");

    }

}

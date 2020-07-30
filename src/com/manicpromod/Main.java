package com.manicpromod;

import com.manicpromod.crackingcoding.CreateLinkedList;

import static com.manicpromod.crackingcoding.DeleteNode.addNode;

public class Main {

    public static void main(String[] args) {
        CreateLinkedList.Node head = new CreateLinkedList.Node(10);

        addNode(head,20);
        addNode(head,30);
        addNode(head,40);
        addNode(head,50);

        System.out.println("Traversing the values");
    }
}

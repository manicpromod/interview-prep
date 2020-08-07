package org.manicpromod.crackingcoding.linkedlist;



/**
 * Created by pmanickam on 7/29/2020 at 4:20 PM
 */
public class CreateLinkedList {

    public static class Node {

        int data;
        Node next = null;

        public Node(int data) {

            this.data = data;
            this.next = next;
        }

        public void addNode(int data) {

            Node end = new Node(data);
            Node node = this;
            while(node.next != null) {

                node = node.next;
            }
            node.next = end;
        }
    }

}

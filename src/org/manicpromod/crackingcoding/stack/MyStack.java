package org.manicpromod.crackingcoding.stack;

import java.util.EmptyStackException;

/**
 * Created by pmanickam on 8/7/2020 at 8:21 AM
 */
public class MyStack {

    public static class Stack<T> {


        private int data;
        private Stack<Integer> next;

        public Stack(Integer data) {

            this.data = data;
        }

        private static Stack top;

        public static void push(Integer data) {

            Stack stack = new Stack(data);
            stack.next = top;
            top = stack;

        }

        public static Integer pop(){

            if(top == null) {
                throw new EmptyStackException();
            }
            Integer item = top.data;
            top = top.next;
            return item;
        }

        public Integer peek() {
            if(top == null) {
                throw new EmptyStackException();
            }
            return top.data;
        }

        public static void iterateStack(Stack<Integer> stack){

            while(stack != null) {
                System.out.println(pop());
            }

        }

        public static void main(String[] args){

            Stack<Integer> stack = new Stack<Integer>(10);
            push(10);
            push(20);
            push(30);
            push(40);
            push(50);
            iterateStack(stack);
        }

    }

}

package com.thirtydaysofthejava.day15;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    public static  Node insert(Node head, int data) {
        Node node = new Node(data);

        if (head == null)
            return node;

        Node nextNode = head;


        while(nextNode.next != null) {
            nextNode = nextNode.next;
        }

        nextNode.next = node;


        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

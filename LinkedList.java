
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pras
 */
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    public static Node insert(Node head, int data) {
       
        Node n = null;
        if (head == null) {
            head = new Node(data);
        } else {
            n = head;
            if (n.next == null) {

                n.next = new Node(data);
            } else {
                while (n.next != null) {
                    n = n.next;
                }
                n.next = new Node(data);
            }

        }
        return head;
    }
    public static Node removeDuplicates(Node head) {
        
     
        Node start = head;
        while (start.next != null) {
            if (start.data == start.next.data) {
                start.next = start.next.next;
            } else {

                start = start.next;
            }
        }

        return head;

    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
            System.out.println(head.data + " " + head.next + head.toString());
        }
        head=removeDuplicates(head);
        display(head);
        sc.close();
    }
}

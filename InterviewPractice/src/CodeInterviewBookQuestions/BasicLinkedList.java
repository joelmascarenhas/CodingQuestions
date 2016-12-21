package CodeInterviewBookQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 21-12-2016.
 */
public class BasicLinkedList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp;
        Node head = new Node(scanner.nextInt());
        n--;
        while(n>0)
        {
            temp = scanner.nextInt();
            head.insert(temp);
            n--;
        }
        head.print();

    }
}

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    void insert(int data)
    {
        Node temp = new Node(data);
        Node n = this;

        while(n.next != null)
            n = n.next;
        n.next = temp;
    }

    void print()
    {
        Node head = this;
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
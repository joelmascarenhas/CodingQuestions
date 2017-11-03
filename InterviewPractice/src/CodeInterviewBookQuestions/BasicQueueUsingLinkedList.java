package CodeInterviewBookQuestions;

import java.util.ArrayList;

/**
 * Created by Joel on 09-03-2017.
 */
public class BasicQueueUsingLinkedList {
    public static void main(String[] args) {
        LinkedListQueue<Number> queue = new LinkedListQueue<>();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(queue.isEmpty());
        queue.push(0.000003);
        queue.push(-13f);
        queue.push(53.1114);
        System.out.println(queue.getFront());
        System.out.println(queue.getLast());
        while(!queue.isEmpty())
            System.out.println(queue.pop());
        System.out.println(queue.isEmpty());
    }
}
class QNode<Item>
{
    QNode next;
    QNode prev;
    Item value;
    QNode(Item value)
    {
        this.value = value;
        next = null;
        prev = null;
    }
}
class LinkedListQueue<Item>
{
    QNode head;
    QNode tail;
    LinkedListQueue()
    {
        head = tail = null;
    }

    void push(Item val)
    {
        QNode temp = new QNode(val);
        if(head == null)
        {
            temp.next = null;
            temp.prev = null;
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }


    }
    Item pop()
    {
        if(head == null)
            return null;
        else if(head.next == null)
        {
            QNode temp = head;
            head = tail = null;
            return (Item)temp.value;
        }
        else
        {
            QNode temp = head;
            temp.next.prev = null;
            head = head.next;
            return (Item)temp.value;

        }

    }
    Item getFront()
    {
        return (Item)head.value;
    }
    Item getLast()
    {
        return (Item)tail.value;
    }
    boolean isEmpty()
    {
        return (head == null);
    }
}
package CodeInterviewBookQuestions;

import java.util.ArrayList;

/**
 * Created by Joel on 08-03-2017.
 */
public class BasicQueueUsingArrayList {
    public static void main(String[] args) {
        Queue<Number> queue = new Queue<>();
        System.out.println(queue.isEmpty());
        queue.push(12f);
        queue.push(0.000003);
        queue.push(345);
        queue.push(-1);
        System.out.println("Front = " + queue.front());
        System.out.println("Back = " + queue.back());
        System.out.println("Popping - " + queue.pop());
        System.out.println("Popping - " + queue.pop());
        System.out.println("Popping - " + queue.pop());
        System.out.println("Front = " + queue.front());
        System.out.println("Back = " + queue.back());
        System.out.println("Popping - " + queue.pop());
        System.out.println(queue.isEmpty());
        }
}
class Queue<Item>
{
    ArrayList<Item> arr;
    Queue()
    {
         arr = new ArrayList<>();
    }
    void push(Item val)
    {
        if(arr.isEmpty())
            arr.add(val);
        else
        {
            arr.add(arr.size(),val);
        }
    }
    Item pop()
    {
        if(arr.isEmpty())
            return null;
        else
            return arr.remove(0);

    }
    boolean isEmpty()
    {
        return arr.isEmpty();
    }
    Item front()
    {
        if(arr.isEmpty())
            return null;
        else
            return arr.get(0);
    }
    Item back()
    {
        if(arr.isEmpty())
            return null;
        else
            return arr.get(arr.size()-1);
    }
}

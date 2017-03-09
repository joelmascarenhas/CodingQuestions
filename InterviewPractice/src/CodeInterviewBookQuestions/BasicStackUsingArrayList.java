package CodeInterviewBookQuestions;

import java.util.ArrayList;

/**
 * Created by Joel on 08-03-2017.
 */
public class BasicStackUsingArrayList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push('f');
        stack.push('g');
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
class Stack<Item>
{
    ArrayList<Item> arr;
    Stack()
    {
        arr = new ArrayList<>();
    }
    void push(Item val)
    {
        if(isEmpty())
            arr.add(val);
        else
            arr.add(arr.size(),val);
    }
    Item pop() {
        if (isEmpty())
            {
                System.out.println("Stack Empty");
                return null;
            }
        else
            return arr.remove(arr.size()-1);

    }
    boolean isEmpty()
    {
        return arr.isEmpty();
    }
    Item peek()
    {
        return arr.get(arr.size()-1);
    }
}
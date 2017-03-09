package CodeInterviewBookQuestions;

/**
 * Created by Joel on 07-03-2017.
 */
public class BasicStackWithLinkedList {
    public static void main(String[] args) {
        LinkedListStack<Number> stack = new LinkedListStack<>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.push(5);
        stack.push(0.56);
        stack.push(0.5f);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
class SNode<Item>
{
    SNode next;
    Item val;
    SNode(Item val)
    {
        next = null;
        this.val = val;
    }
}

class LinkedListStack<Item>
{
    SNode<Item> head;
    LinkedListStack()
    {
        head = null;
    }
    void push(Item val)
    {
        SNode temp = new SNode(val);
        if(head == null)
        {
            head = temp;
            head.next = null;
        }
        else
        {
            temp.next = head;
            head = temp;
        }
    }
    Item pop()
    {
        if(head == null)
        {
            return null;
        }
        else
        {
        Item value = head.val;
        head = head.next;
        return value;
        }
    }
    Item peek()
    {
        if(head == null)
        {
            return  null;
        }
        else
            return head.val;
    }
    boolean isEmpty()
    {
        return (head == null);
    }
}



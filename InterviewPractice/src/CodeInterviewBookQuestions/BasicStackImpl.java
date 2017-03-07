package CodeInterviewBookQuestions;

/**
 * Created by Joel on 07-03-2017.
 */
public class BasicStackImpl {
    public static void main(String args[])
    {
        GenStack myStack = new GenStack(15);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        while(!myStack.isEmpty())
        {
            System.out.println(myStack.pop());
        }
    }
}
class GenStack{
    int arr[];
    int size;
    int top;
    GenStack(int s)
    {
       size = s;
       arr = new int[size];
       top = -1;
    }
    public void push(int no)
    {
        if(top == size)
            System.out.println("stack full, number cannot be pushed");
        else
            arr[++top] = no;
    }
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack empty, nothing to pop");
            return 0;
        }
        else
            return arr[top--];
    }
    public int peek()
    {
        return arr[top];
    }
    public boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if(top == size-1)
            return true;
        else
            return false;
    }


}
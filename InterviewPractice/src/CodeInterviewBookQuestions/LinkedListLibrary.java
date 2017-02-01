package CodeInterviewBookQuestions;

/**
 * Created by Joel on 01-02-2017.
 */
public class LinkedListLibrary
{
    int data;
    LinkedListLibrary next;
    LinkedListLibrary(int data)
    {
        this.data = data;
        this.next = null;
    }
    void insertatEnd(int data)
    {
        LinkedListLibrary newNode = new LinkedListLibrary(data);
        LinkedListLibrary head = this;
        while(head.next != null)
            head = head.next;
        head.next = newNode;
    }
    void displayLinkedList()
    {
        LinkedListLibrary curr = this;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    LinkedListLibrary delete(int data)
    {
        LinkedListLibrary curr = this;
        LinkedListLibrary prev = null;
        while((curr != null))
        {
            if((curr.data == data)&&(prev == null))
            {
                LinkedListLibrary temp = curr;
                curr = curr.next;
                temp.next = null;
                return curr;
            }
            else if(curr.data == data) {
                LinkedListLibrary temp = curr;
                prev.next = curr.next;
                curr = curr.next;
                temp.next = null;
                break;
            }
        }
        return this;
    }
    boolean checkifexists(int data)
    {
        LinkedListLibrary curr = this;
        while(curr != null)
        {
            if(curr.data == data)
                return true;
            curr = curr.next;
        }
        return false;
    }
    int getLinkedListlength()
    {
        int length = 0;
        LinkedListLibrary curr = this;
        while(curr != null)
        {
            length+= 1;
            curr = curr.next;
        }
        return length;
    }

}
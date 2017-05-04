package CodeInterviewBookQuestions;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joel on 01-02-2017.
 */
public class LinkedListLibrary
{
    public int data;
    public LinkedListLibrary next;
    public LinkedListLibrary(int data)
    {
        this.data = data;
        this.next = null;
    }
    public void insertatEnd(int data)
    {
        LinkedListLibrary newNode = new LinkedListLibrary(data);
        LinkedListLibrary head = this;
        while(head.next != null)
            head = head.next;
        head.next = newNode;
    }
    public void displayLinkedList()
    {
        LinkedListLibrary curr = this;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public LinkedListLibrary delete(int data)
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
            else
            {
                prev = curr;
                curr = curr.next;
            }
        }
        return this;
    }
    public boolean checkifexists(int data)
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
    public int getLinkedListlength()
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
    public boolean checkForCycle()
    {
        return true;
    }
    public boolean checkForCycleHash(LinkedListLibrary head)
    {
        Set<LinkedListLibrary> set = new HashSet<LinkedListLibrary>();
        while(head != null)
        {
            if(set.contains(head))
                return true;
            else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }

}
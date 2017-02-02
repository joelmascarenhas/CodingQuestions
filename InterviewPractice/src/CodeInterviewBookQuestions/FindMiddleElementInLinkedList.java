package CodeInterviewBookQuestions;

import java.util.Scanner;
/**
 * Created by Joel on 01-02-2017.
 */
public class FindMiddleElementInLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of elements in LinkedList");
        int no = scanner.nextInt();
        System.out.println("Enter The values for the LinkedList");
        LinkedListLibrary head = new LinkedListLibrary(scanner.nextInt());
        for(int i=0;i<no-1;i++)
        {
            head.insertatEnd(scanner.nextInt());
        }

        int midelement = findMidelement(head);
        System.out.println("Value at mid-position " + midelement);
    }
    public static int findMidelement(LinkedListLibrary head)
    {
        LinkedListLibrary curr = head;
        LinkedListLibrary fwd = head;
        int ctr = 0;
        while(fwd != null)
        {
            if(ctr != 2)
            {
                fwd = fwd.next;
                ctr+= 1;
            }
            else
            {
                curr = curr.next;
                fwd = fwd.next;
                ctr = 1;
            }
        }
        return curr.data;
    }
}


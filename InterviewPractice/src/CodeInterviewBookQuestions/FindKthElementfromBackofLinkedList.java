package CodeInterviewBookQuestions;

import sun.awt.image.ImageWatched;
import sun.awt.image.IntegerComponentRaster;

import java.util.Scanner;


/**
 * Created by Joel on 01-02-2017.
 */
public class FindKthElementfromBackofLinkedList {
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
        System.out.println("Enter Value of k");
        int k = scanner.nextInt();
        //head.displayLinkedList();
        int Kelement = findelement(head,k);
        System.out.println("Value at position " + k + " from behind is " + Kelement);

    }
    public static int findelement(LinkedListLibrary head,int k)
    {
        LinkedListLibrary curr = head;
        LinkedListLibrary fwd = curr;
        int ct = 0;
        while(fwd != null)
        {
            if(ct != k)
            {
                fwd = fwd.next;
                ct+= 1;
            }
            else
            {
                fwd = fwd.next;
                curr = curr.next;
            }

        }
        if(ct == k)
            return curr.data;
        else
        {
            return Integer.MAX_VALUE;
        }
    }

}

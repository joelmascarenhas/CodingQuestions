package SodaCodeChallenge;
import CodeInterviewBookQuestions.LinkedListLibrary;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Joel on 18-02-2017.
 */
public class CheckLoopsInLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListLibrary temp = null;
        LinkedListLibrary end = null;
        LinkedListLibrary Node = new LinkedListLibrary(5);
        Node.insertatEnd(10);
        Node.insertatEnd(15);
        Node.insertatEnd(20);
        Node.insertatEnd(25);
        Node.insertatEnd(30);
        Node.insertatEnd(35);
        Node.insertatEnd(40);
        Node.insertatEnd(45);

        int i = 0;
        temp = Node;
        end = Node;
        while(i<3)
        {
            temp = temp.next;
            i++;
        }
        while(end.next != null)
        {
            end = end.next;
        }
        end.next = temp;

        boolean result = Node.checkForCycleHash(Node);
        System.out.println(result);
    }

}

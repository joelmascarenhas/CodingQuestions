package CodeInterviewBookQuestions;

import java.util.ArrayList;

/**
 * Created by Joel on 14-03-2017.
 */

class GTNode
{
    int value;
    ArrayList<GTNode> children;
    GTNode(int value)
    {
        this.value = value;
        children = new ArrayList<>();
    }

}

public class ConvertGraphToTree {
    public static void main(String[] args) {
        GTNode root1 = new GTNode(1);
        GTNode root2 = new GTNode(2);
        GTNode root3 = new GTNode(3);
        GTNode root4 = new GTNode(4);
        GTNode root5 = new GTNode(5);
        GTNode root6 = new GTNode(6);
        GTNode root7 = new GTNode(7);

        root1.children.add(root2);root1.children.add(root3);
        root2.children.add(root4);root3.children.add(root4);
        root4.children.add(root5);root4.children.add(root6);
        root5.children.add(root7);root6.children.add(root7);
        GTNode finaltree = convert(root1);

    }
    public static GTNode convert(GTNode root)
    {
        if(root == null)
            return null;
        GTNode node = new GTNode(root.value);
        for(GTNode gt:root.children)
        {
            GTNode childgt = convert(gt);
            node.children.add(childgt);
        }
        return node;
    }
}

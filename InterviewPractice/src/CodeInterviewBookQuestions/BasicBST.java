package CodeInterviewBookQuestions;
import java.util.Scanner;

/**
 * Created by Joel on 26-12-2016.
 */
public class BasicBST {
    public static void main(String[] args) {
        BST tree = new BST(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(2);
        tree.insert(8);
        tree.insert(17);
        tree.insert(6);
        tree.insert(11);

        System.out.print("Inorder - ");
        tree.InOrder(tree.root);
        System.out.println();
        System.out.print("Preorder - ");
        tree.PreOrder(tree.root);
        System.out.println();
        System.out.print("Postorder - ");
        tree.PostOrder(tree.root);

        System.out.println(tree.checkifelementexists(tree.root,15));
        System.out.println(tree.checkifelementexists(tree.root,7));

    }
}

class BSTNode
{
    int value;
    BSTNode leftchild;
    BSTNode rightchild;
    BSTNode(int value)
    {
        this.value = value;
        leftchild = null;
        rightchild = null;
    }
}

class BST
{
    BSTNode root;
    BST(int value)
    {
        root = new BSTNode(value);
    }
    void insert(int value)
    {
        BSTNode newNode = new BSTNode(value);
        if(root == null)
            root = newNode;
        else
        {
            BSTNode temp = root;
            while(true)
            {
                if(newNode.value < temp.value)
                    if(temp.leftchild == null)
                    {
                        temp.leftchild = newNode;
                        break;
                    }
                    else
                        temp = temp.leftchild;
                else
                     if(temp.rightchild == null)
                     {
                         temp.rightchild = newNode;
                         break;
                     }
                     else
                         temp = temp.rightchild;

            }
        }
    }
    void InOrder(BSTNode node)
    {
        if(node != null)
        {
            InOrder(node.leftchild);
            System.out.println(node.value);
            InOrder(node.rightchild);
        }
    }
    void PreOrder(BSTNode node)
    {
        if(node != null)
        {
            System.out.println(node.value);
            PreOrder(node.leftchild);
            PreOrder(node.rightchild);
        }
    }
    void PostOrder(BSTNode node)
    {
        if(node != null)
        {
            PostOrder(node.leftchild);
            PostOrder(node.rightchild);
            System.out.println(node.value);

        }
    }
    boolean checkifelementexists(BSTNode current,int key)
    {
        if(current == null)
            return false;
        if(current.value == key)
            return true;
        else if(key < current.value)
            return checkifelementexists(current.leftchild,key);
        return checkifelementexists(current.rightchild,key);
    }
}
/*
package CodeInterviewBookQuestions;

*/
/**
 * Created by Joel on 14-03-2017.
 *//*

public class CheckifBTisBST {
    public static void main(String[] args) {

    }
}

    boolean checkBST(Node root) {
        if((root.left != null) && (root.right != null))
        {
            if((root.left.data < root.data) && (root.right.data > root.data))
                return (checkBST(root.left) && (checkBST(root.right)) && (maxTree(root.left) < root.data) && (minTree(root.right) > root.data));
            return false;
        }
        else if(root.left != null)
        {
            if(root.left.data < root.data)
                return (checkBST(root.left) && (maxTree(root.left) < root.data));
            return false;
        }
        else if(root.right != null)
        {
            if(root.right.data > root.data)
                return (checkBST(root.right) && (minTree(root.right) > root.data)) ;
            return false;
        }
        return true;

    }

    int maxTree(Node root)
    {
        int max = root.data;
        if((root.left!= null) && (root.right!=null))
            max = java.lang.Math.max(java.lang.Math.max(maxTree(root.left),root.data),maxTree(root.right));
        else if(root.left!=null)
            max = java.lang.Math.max(maxTree(root.left),root.data);
        else if(root.right!=null)
            max = java.lang.Math.max(maxTree(root.right),root.data);
        else
            return root.data;
        return max;
    }

    int minTree(Node root)
    {
        int min = root.data;
        if((root.left!= null) && (root.right!=null))
            min = java.lang.Math.min(java.lang.Math.min(minTree(root.left),root.data),minTree(root.right));
        else if(root.left!=null)
            min = java.lang.Math.min(minTree(root.left),root.data);
        else if(root.right!=null)
            min = java.lang.Math.min(minTree(root.right),root.data);
        else
            return root.data;
        return min;
    }

*/

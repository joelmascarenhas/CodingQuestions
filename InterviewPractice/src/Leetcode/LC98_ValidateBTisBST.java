package Leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Joel on 15-05-2018.
 */
public class LC98_ValidateBTisBST {
    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value)
        {
            this.val = value;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.left.left = new TreeNode(28);
        root.left.left.right = new TreeNode(29);

        root.right = new TreeNode(80);
        root.right.left = new TreeNode(75);
        root.right.right = new TreeNode(90);
        System.out.println(checkBSTDriver(root));
    }
    public static boolean checkBSTDriver(TreeNode root)
    {
        return checkBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean checkBST(TreeNode root,long min,long max) {
        if (root == null)
            return true;
        else if(root.left!= null && root.right!= null)
        {
            boolean leftside = false,rightside = false;
            leftside = (checkBST(root.left,min,root.val) && root.val < max && root.val > min);
            rightside = (checkBST(root.right,root.val,max) && root.val < max && root.val > min);
            if(leftside == false || rightside == false)
                return false;
        }
        else if(root.left!= null)
        {
            return (checkBST(root.left,min,root.val) && root.val < max && root.val > min);
        }
        else if(root.right!= null)
        {
            return (checkBST(root.right,root.val,max) && root.val < max && root.val > min);
        }
        else
        {
            return (root.val < max && root.val > min);
        }
        return true;
    }

}


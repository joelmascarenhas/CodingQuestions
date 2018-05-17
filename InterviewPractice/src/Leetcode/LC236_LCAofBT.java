package Leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Joel on 16-05-2018.
 */
public class LC236_LCAofBT {
    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val = val;
            left = right = null;
        }
    }
    static class LCAObject
    {
        boolean status;
        int val;
        TreeNode node;
        LCAObject(boolean status, int val,TreeNode node)
        {
            this.status = status;
            this.val = val;
            this.node = node;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        System.out.println(findLCADriver(root,5,3).val);
    }
    public static TreeNode findLCADriver(TreeNode root,int p,int q)
    {
        return findLCA(root,p,q).node;
    }

    public static LCAObject findLCA(TreeNode root, int p, int q)
    {
        if(root == null)
            return new LCAObject(false,Integer.MIN_VALUE,null);

        LCAObject left = findLCA(root.left,p,q);
        LCAObject right = findLCA(root.right,p,q);
        if(left.status == true && right.status == true)
            return new LCAObject(true,root.val,root);
        else if((root.val == p || root.val == q) && (left.status == true || right.status == true))
            return new LCAObject(true,root.val,root);
        else if(root.val == p || root.val == q)
            return new LCAObject(true,root.val,root);
        else if(left.status == true)
            return new LCAObject(true,left.val,left.node);
        else if(right.status == true)
            return new LCAObject(true,right.val,right.node);
        else
            return new LCAObject(false,Integer.MIN_VALUE,null);
    }
}

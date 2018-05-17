package Leetcode;

import java.util.Stack;

/**
 * Created by Joel on 15-05-2018.
 */
public class LC173_BinarySearchTreeIterator {
    Stack<TreeNode> stack;
    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.left.right.left = new TreeNode(35);
        root.right = new TreeNode(60);
        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(80);

        LC173_BinarySearchTreeIterator i = new LC173_BinarySearchTreeIterator(root);
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

    public LC173_BinarySearchTreeIterator(TreeNode root)
    {
        stack = new Stack<>();
        stack.push(root);
        while(root.left != null)
        {
            stack.push(root.left);
            root = root.left;
        }
    }

    public boolean hasNext()
    {
        return (stack.size() > 0);
    }

    public int next()
    {
        TreeNode current = stack.pop();
        if(current.right != null) {
            TreeNode temp = current.right;
            stack.push(temp);
            while(temp.left != null)
            {
                stack.push(temp.left);
                temp = temp.left;
            }
        }
        return current.val;
    }
}

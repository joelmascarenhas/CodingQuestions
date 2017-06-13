package Leetcode;

/**
 * Created by Joel on 11-06-2017.
 */
public class LC513_FIndBottomLeftTreeValue {
    private static int max_level = 0;
    private static TreeNode leftMost = null;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        System.out.println(findBottomLeftValue(root));
    }
    public static int findBottomLeftValue(TreeNode root) {
        leftMost = root;
        getHeight(root,0);
        return leftMost.val;
    }
    public static void getHeight(TreeNode current,int current_level)
    {
        if(current == null)
            return;

        if(current_level > max_level)
        {
            leftMost = current;
            max_level = current_level;
        }
        getHeight(current.left,1+current_level);
        getHeight(current.right,1+current_level);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

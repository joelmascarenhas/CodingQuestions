package CodeInterviewBookQuestions;

/**
 * Created by Joel on 03-05-2017.
 */
public class BSTMirror {
    public static void main(String[] args) {
        MirrorBST bst = new MirrorBST(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(8);
        bst.insert(17);
        bst.insert(6);
        bst.insert(11);
        bst.inorder(bst.root);
        bst.mirrorTree(bst.root);
        bst.inorder(bst.root);
    }
}
class MirrorNode
{
    int value;
    MirrorNode left;
    MirrorNode right;
    MirrorNode(int value)
    {
        this.value = value;
        left = right = null;
    }
}
class MirrorBST
{
    MirrorNode root;
    MirrorBST(int value)
    {
        root = new MirrorNode(value);
    }
    void insert(int value)
    {
        MirrorNode current = root;
        MirrorNode newNode = new MirrorNode(value);
        while(true)
        {
            if(newNode.value < current.value)
            {
                if(current.left == null)
                {
                    current.left = newNode;
                    break;
                }
                else
                    current = current.left;
            }
            else
            {
                if(current.right == null)
                {
                    current.right = newNode;
                    break;
                }
                else
                    current = current.right;
            }
        }
    }
    MirrorNode mirrorTree(MirrorNode current)
    {
        if(current == null)
            return null;

        MirrorNode left = mirrorTree(current.left);
        MirrorNode right = mirrorTree(current.right);

        current.left = right;
        current.right = left;
        return current;
    }
    void inorder(MirrorNode current)
    {
        if(current == null)
            return;
        inorder(current.left);
        System.out.println(current.value);
        inorder(current.right);
    }
}

package operations;
import classes.Node;


public class Insert {
    public static Node insert(Node root, int val){
        //Assumimg there are no duplicate values

        if(root == null){
            root = new Node(val);
        }
        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else if (root.data < val){
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
}

//Time Complexity : O(h)
// h is the height of the tree
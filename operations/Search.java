package operations;
import classes.Node;

public class Search {
    public static boolean search(Node root, int val){
        if(root == null ){
            return false;
        }
        if(root.data == val){
            return true;
        }
        else if(root.data > val){
            //left subtree
            return search(root.left, val);
        }
        else{
            //right subtree
            return search(root.right, val);
        }
    }    
}

//Time Complexity : O(h)
// h is the height of the tree

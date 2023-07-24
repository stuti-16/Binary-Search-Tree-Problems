package operations;
import classes.Node;

public class Delete {
    // Here we are returning the root node of the updated tree
    public static Node delete(Node root, int val){
        if(root == null){
            System.out.println("Value not Found");
            return root;
        }
        //search for the node
        if(root.data > val){
            //left subtree
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            //right subtree
            root.right = delete(root.right, val);
        }

        else{ //root.data == val
            //case 1: When the node to be deleted is the leaf node
            if(root.right == null && root.left == null){
                return null;
            }

            //case 2: When root has only one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3: When root has both children
            else{//here we will return the next elsement of the root in the inorder traversal
                //which is equal to the left most child of the right subtree
                // Remember: InorderSuccessor will have either 0 or 1 child i.e case 1 or case 2
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, val);                
            }
            // return root;
        }
        return root;     
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}


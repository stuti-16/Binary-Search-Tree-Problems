import classes.Node;
import operations.*;

import java.util.ArrayList;

import Questions.*;

public class Main{
    public static void main(String[] args){
        int[] values ={8,5,3,1,4,6,10,11,14};
        Node root= null;

        //inserting values in the tree
        // Insert im = new Insert(); (by creating object)
        for(int i=0; i<values.length; i++){        
            root = Insert.insert(root, values[i]);
        }

        // Inorder traversal
        Inorder.io(root);

        //searching
        System.out.println(Search.search(root, 7));

        //deleting
        // Delete.delete(root, 1);
        // Inorder.io(root);

        //----------------------------------------------------
        //Q1
        System.out.println("");
        Q1.range(root,2,4);

        //Q2
        System.out.println("");
        Q2.root2Leaf(root, new ArrayList<>());

    }
}
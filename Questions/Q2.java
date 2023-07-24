package Questions;
import java.util.ArrayList;

import classes.Node;

//Ques: Print all the Root to leaf paths present in the tree
public class Q2 {
    public static void root2Leaf(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        list.add(root.data); 

        if(root.left == null && root.right ==null){
            printPath(list);
        } else{
            root2Leaf(root.left,list);
            root2Leaf(root.right, list);
        }
        list.remove(list.size()-1);
        
    }    

    public static void printPath(ArrayList<Integer> list){
        for(int i =0; i< list.size(); i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println();
    }
}

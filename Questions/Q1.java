package Questions;
import classes.Node;

//Ques: Print in given range. Numbers given in range are inclusive.
// Example: x=6, y=10 in the tree ; {1,3,4,5,6,8,10,11,14}; Ans: 6,8,10
public class Q1 {
    public static void range(Node root, int x, int y){
        if(root == null){
            return;
        }
        //case 1: root>(x,y) -> left subtree
        if(root.data>x && root.data>y){
            range(root.left, x, y);
        }

        //case 2: root<(x,y) -> right subtree
        else if(root.data<x && root.data<y){
            range(root.right, x, y);
        }
         
        //case 3: (x <= root.data <= y) -> root in range
        else{
            range(root.left, x, y);
            System.out.print(root.data + " ");            
            range(root.right, x, y);
        }        
    }
}

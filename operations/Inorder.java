package operations;
import classes.Node;

public class Inorder {
    public static void io(Node root){
        if(root == null){
            return;
        }
        io(root.left);
        System.out.print(root.data + " ");
        io(root.right);
        
    }
}

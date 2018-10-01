package csassignment;
import java.util.ArrayList; 

public class LCA <Key extends Comparable<Key>, Value>{

Node root;

// Method to find lowest common ancestor.
	class Node {
		private Key key;
		private Value val; 
		private Node left, right;
		private int N;
		
	//constructor
	   public Node(Key key, Value val, int N){
		   this.val = val;
		   this.key = key;
		   this.N = N;
		   
	   }
	         
}


public class LCA {

    public Node lca(Node root, Node n1, Node n2){
        if(root == null){
            return null;
        }
        if(root == n1 || root == n2){
            return root;
        }
        
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
}
}


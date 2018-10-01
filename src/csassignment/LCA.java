package csassignment;

//Java Program for Lowest Common Ancestor in a Binary Tree 
//A O(n) solution to find LCA of two given values n1 and n2 
import java.util.ArrayList; 
import java.util.List; 

// Method to find lowest common ancestor.
	class Node {
	  int val;
	   Node left, right;
	   Node(int value){
		   this.val = val;
	       this.left = this.right = null;

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

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
public boolean isEmpty()
{
	return size()==0;
}

public int size()
{
	return size(root);
	
}

private int size (Node x)
{
	if ( x==null)
	{
		return 0; 
	}
	else return x.N;
	
}

public boolean contains(Key key){
	return get (key)!=null;
	
}

public Value get ( Key key){
	
	return get (root, key);
	
}
private Value get(Node node, Key key)
{
	if (node == null) return null;
	int cmp = key.compareTo(node.key);
	if(cmp<0) 
	{
		return get(node.left, key);
	}
	else if ( cmp>0)
	{
		return get(node.right,key);
	}
	else 
	{
		return node.val;
	}		
}

public void put(Key key, Value val)
{
	if ( val == null) { delete(key);return; }
	root = put(root, key,val);
		}


private Node put (Node node, Key key, Value val){
	if (node == null)
	{
		return new Node (key, val,1 );
	}
	int cmp = key.compareTo(node.key);
	if      (cmp < 0) node.left  = put(node.left,  key, val);
	else if (cmp > 0) node.right = put(node.right, key, val);
	else              node.val   = val; //updating value
	node.N = 1 + size(node.left) + size(node.right); // value child1 + value child2 + 1
	return node;
}

/**
 * Deletes a key from a tree (if the key is in the tree).
 * Note that this method works symmetrically from the Hibbard deletion:
 * If the node to be deleted has two child nodes, then it needs to be
 * replaced with its predecessor (not its successor) node.
 *
 * @param key the key to delete
 */
public void delete(Key key) {
	root = delete(root, key);	
}

private Node delete (Node node, Key key) {
	if (node == null) { 
		return null;
	}
	
    int compare = key.compareTo(node.key);
    
    if   (compare > 0) {
    	node.right = delete(node.right, key);
    	node.left  = delete(node.left,  key);
    }
    else if (compare < 0) {
    	node.left  = delete(node.left,  key);
    }
    else {
    	if (node.right == null) {
    		return node.left;
    	}
        if (node.left  == null) {
        	return node.right;
        }
        Node temp = node;
        node = max(temp.left);                              
        node.left = deleteMax(temp.left);                 
        node.right = temp.right; 
    }
    
    node.N = size(node.left) + size(node.right) + 1;
    return node;
	
}

private Node deleteMax(Node node) 
{
    if (node.right == null) return node.left;
    node.right = deleteMax(node.right);
    node.N = size(node.left) + size(node.right) + 1;                                 
    return node;
}

public Node max(Node node)
   {
     if(node.right!=null) {
       return max(node.right);
     }
     return node;
   }

// Used: www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree as a help source.
 	public Key lowestCommonAncestor (Node node, Key key1, Key key2){
 		if (node == null)
             return null;
 		if (node.key == key1) {
 			return node.key;
 		}
 		if (node.key == key2) {
 			return node.key;
 		}
 		int cmp1 = node.key.compareTo(key1);
 		int cmp2 = node.key.compareTo(key2);
 		
         if (cmp1 >= 0 && cmp2 >= 0)
             return lowestCommonAncestor(node.left, key1, key2);
   
         if (cmp1 <= 0 && cmp2 <= 0)
             return lowestCommonAncestor(node.right, key1, key2);
   
         return node.key;
 	}












}






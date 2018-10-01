package csassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LCAtest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	 public static void main(String[] args) 
	 { 
	     LCA tree = new LCA(); 
	     tree.root = new Node(1); 
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4); 
	     tree.root.left.right = new Node(5); 
	     tree.root.right.left = new Node(6); 
	     tree.root.right.right = new Node(7); 

	     System.out.println("LCA(4, 5): " + tree.findLCA(4,5)); 
	     System.out.println("LCA(4, 6): " + tree.findLCA(4,6)); 
	     System.out.println("LCA(3, 4): " + tree.findLCA(3,4)); 
	     System.out.println("LCA(2, 4): " + tree.findLCA(2,4)); 
	     System.out.println("LCA(7, 7): " + tree.findLCA(7,7)); 
	   
	 } 

}

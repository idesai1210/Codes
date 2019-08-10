
// Java program to find largest  
// subtree sum in a given binary tree.  
import java.util.*;

class MaxAvgSubTree {

	// Structure of a tree node.
	static class Node {
		int key;
		Node left, right;
	}

	static class INT {
		int v;
		Node n;

		INT(int a, Node b) {
			v = a;
			n = b;
		}
	}

	// Function to create new tree node.
	static Node newNode(int key) {
		Node temp = new Node();
		temp.key = key;
		temp.left = temp.right = null;
		return temp;
	}

	// Helper function to find largest
	// subtree sum recursively.
	static INT findLargestSubtreeSumUtil(Node root, INT ans) {
		// If current node is null then
		// return 0 to parent node.
		if (root == null)
			return new INT(0, null);

		// Subtree sum rooted
		// at current node.
		INT tmp = new INT(0, root);
		INT left = (INT)findLargestSubtreeSumUtil(root.left, ans);
		INT right = (INT)findLargestSubtreeSumUtil(root.right, ans);
		tmp.v = (int)(root.key + left.v + right.v) / maxDepth(root);

		// Update answer if current subtree
		// sum is greater than answer so far.
		
		if (tmp.v > ans.v ) {
			ans.v = Math.max(ans.v, tmp.v);
			ans.n = tmp.n;
		}

		// Return current subtree
		// sum to its parent node.
		return new INT(root.key, root);
	}

	// Function to find
	// largest subtree sum.
	static int findLargestSubtreeSum(Node root) {
		// If tree does not exist,
		// then answer is 0.
		if (root == null)
			return 0;

		// Variable to store
		// maximum subtree sum.
		INT ans = new INT(-9999999, root);

		// Call to recursive function
		// to find maximum subtree sum.
		findLargestSubtreeSumUtil(root, ans);

		return ans.n.key;
	}
	static int maxDepth(Node node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left); 
            int rDepth = maxDepth(node.right); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
    } 

	// Driver Code
	public static void main(String args[]) {
		/*
		20 ​ 
	     /   \ 
	  1       14 
	  / \      / \ 
	-1  1     5  -1
	*/

		Node root = newNode(20);
		root.left = newNode(1);
		root.right = newNode(14);
		root.left.left = newNode(-1);
		root.left.right = newNode(1);
		root.right.left = newNode(5);
		root.right.right = newNode(-1);

		System.out.println(findLargestSubtreeSum(root));
	}
}
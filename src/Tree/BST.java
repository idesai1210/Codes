package Tree;

class Node<T>{
	Node<T> left;
	Node<T> right;
	T data;
	public Node(T data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	
}


public class BST<T extends Comparable<? super T>> {

	public Node<T> root = null;
	
	public BST(){
		this.root = null;
	}
	
	public void insert(T data){
		if(this.root == null){
			this.root = new Node<T>(data);
		}
		else{
			insert(data,this.root);
		}
	}
	
	public Node<T> insert(T data , Node<T> node){
		if(node == null){
			node = new Node<T>(data);
			return node;
		}
		else{
			int com = data.compareTo(node.data);
			if(com < 0){
				node.left = insert(data,node.left);
			}
			else{
				node.right = insert(data, node.right);
			}
			return node;
		}
		
	}
	
	public void inOrdertraverse(Node<T> node){
		
		if(node != null){	
			inOrdertraverse(node.left);
			System.out.println(node.data);
			inOrdertraverse(node.right);
		}
	
	}
	public void preOrdertraverse(Node<T> node){
		if(node != null){
			
			System.out.println(node.data);
			inOrdertraverse(node.left);
			
			inOrdertraverse(node.right);
		}
	}
	
	public void postOrdertraverse(Node<T> node){
		if(node != null){
			
			inOrdertraverse(node.left);
			
			inOrdertraverse(node.right);
			System.out.println(node.data);
		}
	}
	
	private static int counter = 0;
	private Node<T> findKthSmallestItem(Node<T> n, int k) {
		  if(n==null){
		   return null;
		  }
		 
		  Node<T> node = findKthSmallestItem(n.left, k);
		   
		  //If counter is not equal to K, then only increment the counter. 
		  //Once counter is equal to K, it means we have found the desired smallest element and no need to increment further, 
		  //Take the back up of the current node as it might be the Kth smallest element we are looking for.  
		  if(counter != k){
		   counter++;
		   node = n;
		  }
		   
		  //This is the place where actual check is going to happen between counter and K, 
		  //If counter matched K, it means we found the node and no need to find further so simply return the found node.
		  if(counter == k){ 
		   return node;
		  }else{
		   return findKthSmallestItem(n.right, k);
		  }
		 }
	
	private Node<T> findKthlargestItem(Node<T> n, int k) {
		  if(n==null){
		   return null;
		  }
		 
		  Node<T> node = findKthlargestItem(n.right, k);
		   
		  //If counter is not equal to K, then only increment the counter. 
		  //Once counter is equal to K, it means we have found the desired smallest element and no need to increment further, 
		  //Take the back up of the current node as it might be the Kth smallest element we are looking for.  
		  if(counter != k){
		   counter++;
		   node = n;
		  }
		   
		  //This is the place where actual check is going to happen between counter and K, 
		  //If counter matched K, it means we found the node and no need to find further so simply return the found node.
		  if(counter == k){ 
		   return node;
		  }else{
		   return findKthlargestItem(n.left, k);
		  }
		 }
	
	public static void main(String[] args) {
		
		BST<Integer> bst = new BST<>();
		
		bst.insert(10);
		bst.insert(1);
		bst.insert(3);
		bst.insert(5);
		bst.insert(15);
		bst.insert(19);
		bst.insert(14);
		
		
		Node<Integer>  smallest = bst.findKthSmallestItem(bst.root, 1);
		
		System.out.println("Smallest " +smallest.data);
		
		Node<Integer> largest = bst.findKthlargestItem(bst.root, 1);
		
		System.out.println("Smallest " + largest.data);
		
		bst.inOrdertraverse(bst.root);
		//bst.preOrdertraverse(bst.root);
		//bst.postOrdertraverse(bst.root);
	}
	
}

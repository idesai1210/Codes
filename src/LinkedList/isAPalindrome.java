package LinkedList;

public class isAPalindrome<T extends Comparable<T>> {

	static Node<Integer> node,node1;
	
	public static void isPalindrome(LinkdList<Integer> ls){
		
		node = ls.root;
		
		LinkdList<Integer> reverse =  new LinkdList<>();
		reverse.root = null;
		
		while(node != null){
			
			node1 = new Node<Integer>(node.getData());
			node1.setNextNode(reverse.root); 
			//n = reverse.root;
			reverse.root = node1;
			node = node.getNextNode();
			
		}
		

		System.out.println("-------------");
		reverse.traverseList();
		
		
		node = ls.root;
		node1 = reverse.root;
		boolean flag = false;
		while(node != null){
			
			if(node.getData() == node1.getData()){
				flag = true;
			}
			else{
				flag = false;
			}
			
			node = node.getNextNode();
			node1 = node1.getNextNode();
		}
		
		
		if(flag){
			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
		
		
		
		
	}
	
	
	
	
public static void main(String[] args) {
		
		LinkdList<Integer> ls = new LinkdList<>();
		
		ls.insert(1, true);
		ls.insert(5, true);
		ls.insert(6, true);
		
		
		
		ls.insert(6, true);
		ls.insert(5, true);
		ls.insert(16, true);
		
		
		ls.traverseList();
		isPalindrome(ls);
		
		
	}
	
	
	
	
	
	
}

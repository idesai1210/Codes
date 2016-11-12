package LinkedList;

import java.util.HashSet;

public class LinkdList<T extends Comparable<T>> implements list<T>{
	
	Node<T> root; 
	int size;
	@Override
	public void insert(T data, boolean flag) {
		// TODO Auto-generated method stub
		++this.size;
		if(root == null)
			root = new Node<>(data);
		else{
			if(flag)
				insertAtBeginning(data);
			else
				insertAtEnd(data, root);
		}
		
	}

	@Override
	public void delete(T Data) {
		// TODO Auto-generated method stub
		
		if(this.root == null){
			return;
		}
		--this.size;
		
		if(this.root.getData().compareTo(Data) == 0){
			this.root = this.root.getNextNode();
		}
		else{
			remove(Data, root, root.getNextNode());
		}
		
		
	}

	@Override
	public void traverseList() {
		// TODO Auto-generated method stub
		
		if(this.root == null)
			return;
		
		Node<T> node = this.root;
		
		while(node != null){
			System.out.println(node + " ");
			node = node.getNextNode();
		}
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	public void insertAtBeginning(T data){
		
		Node<T> newNode =  new Node<>(data);
		newNode.setNextNode(root);
		this.root = newNode;
		
	}
	
	public void insertAtEnd(T data, Node<T> node){
		if(node.getNextNode() != null){
			insertAtEnd(data,node.getNextNode());
		}
		else{
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
		
	}

	public void remove(T Data, Node<T> previousNode, Node<T> currentNode){
		
		while(currentNode != null){
			
			if(currentNode.getData().compareTo(Data) == 0){
				previousNode.setNextNode(currentNode.getNextNode());
				currentNode = null;
						return;
			}
			
			previousNode =  currentNode;
			currentNode = currentNode.getNextNode();
			
		}
		
		
	}
	
	public void delDuplicates(){
		System.out.println("delte");
		HashSet<T> hs = new HashSet<>();
		Node<T> prev =  null;
		Node<T> current = this.root;
		
		while(current != null){
			if(hs.contains(current.getData())){
				prev.setNextNode(current.getNextNode());
			}
			else{
				hs.add(current.getData());
				prev = current;
			}
			current = current.getNextNode();
			
		}
		
		
	}
	
	public Node<T> nthToLastElement(int n){
		Node<T> n1 = this.root;
		Node<T> n2 = this.root;
		
		for(int i = 0; i < n;i++){
			n1 = n1.getNextNode();
		}
		
		while(n1 != null){
			n1 = n1.getNextNode();
			n2 = n2.getNextNode();
		}
		
		return n2;
	}
	
	
	public static void main(String[] args) {
		
		list<Integer> myLinkedList = new LinkdList<>();
        
        myLinkedList.insert(1,true);
       // myLinkedList.traverseList();
        myLinkedList.insert(2,false);
        //insertAtEnd(3,myLinkedList);
        
        myLinkedList.traverseList();
       
  
		
	}
	
	
	
	
}

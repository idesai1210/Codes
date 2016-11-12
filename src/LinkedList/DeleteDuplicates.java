package LinkedList;

public class DeleteDuplicates<T extends Comparable<T>> {
	
	
	Node<T> root;

	
	public static void main(String[] args) {
		list<Integer> ls = new LinkdList<>();
		
		ls.insert(1, true);
		ls.insert(2, true);
		ls.insert(3, true);
		ls.insert(4, true);
		ls.insert(1, true);
		ls.insert(4, true);
		ls.insert(5, true);
		ls.insert(3, true);
		ls.insert(3, true);
		
		ls.traverseList();
		
		ls.delDuplicates();
		
		Node<Integer> n = ls.nthToLastElement(2);
		System.out.println("Data is "+n.getData());
		
		ls.traverseList();
		
	}
	
}

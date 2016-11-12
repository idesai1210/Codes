package LinkedList;

public interface list<T extends Comparable<T>> {

	public void insert(T Data, boolean flag);
	public void delete(T Data);
	public void traverseList();
	public int size();
	public void delDuplicates();
	public Node<T> nthToLastElement(int n);
	
}

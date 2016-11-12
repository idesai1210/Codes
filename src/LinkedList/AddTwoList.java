package LinkedList;

public class AddTwoList<T extends Comparable<T>> {

	static Node<Integer> node,node1,res;
	public static void add(LinkdList<Integer> ls, LinkdList<Integer> ls1){
		
		//LinkdList<Integer> list = (LinkdList<Integer>)ls;
		//LinkdList<Integer> list1 = (LinkdList<Integer>)ls1;
		
	//	list.traverseList();
		
		if(ls == null && ls1 == null){
			return;
		}
		
		node = ls.root;
		node1 = ls1.root;
		res = null;
		list<Integer> result = new LinkdList<>();
		
		int sum = 0;
		int carry = 0;
		while(node != null){
			
			sum = node.getData() + node1.getData() + carry;
			if(sum > 10){
				carry = sum / 10;
				result.insert(sum % 10, true);
				}
			else{
				carry = 0;
				result.insert(sum, true);
			}
			
			node = node.getNextNode();
			node1 = node1.getNextNode();
			
		}
		if(sum > 10)
			result.insert(sum / 10, true);
		result.traverseList();
		
		
	}
	
	public static void main(String[] args) {
		
		LinkdList<Integer> ls = new LinkdList<>();
		
		ls.insert(16, true);
		ls.insert(5, true);
		ls.insert(6, true);
		
		LinkdList<Integer> ls1 = new LinkdList<>();
		
		ls1.insert(16, true);
		ls1.insert(5, true);
		ls1.insert(6, true);
		
		add(ls,ls1);
		
	}
	
	
}

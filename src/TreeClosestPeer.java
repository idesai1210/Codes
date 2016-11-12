import java.util.Stack;

class TreeNode {
	String data;
	TreeNode child;
	TreeNode parent;
	TreeNode sibling;
	//int level;
	
	public TreeNode(String data) {
		this.data = data;
		child = null;
		parent = null;
		sibling = null;
		//this.level=level;
	}

	public void addChild(TreeNode child) {
		this.child = child;
	}

	public void addParent(TreeNode parent) {
		this.parent = parent;
	}

	public void addSibling(TreeNode sibling) {
		this.sibling = sibling;
	}

}

public class TreeClosestPeer {
	public static TreeNode root;
	Stack<TreeNode> childStack = new Stack<TreeNode>();

	public TreeClosestPeer() {
		this.root = null;
	}

	public void insert(String data, boolean childFlag) {
		TreeNode n = getNode(root, data);
		if (n == null)
			n = new TreeNode(data);

		if (!childStack.isEmpty() && root != null) {
			TreeNode p = childStack.pop();
			p.addChild(n);
			n.addParent(p);
		}
		if (childFlag) {
			childStack.push(n);
		}
		if (root == null) {
			root = n;
		}
	}

	public void addSibling(String data1, String data2) {
		TreeNode siblingTo = getNode(root, data1);
		TreeNode siblingOf = new TreeNode(data2);
		siblingTo.addSibling(siblingOf);
	}

	public void addParentLink(String child, String parent) {
		TreeNode child1 = getNode(root, child);
		TreeNode parent1 = getNode(root, parent);
		child1.addParent(parent1);

	}

	private TreeNode getNode(TreeNode root, String element) {
		if (root != null) {
			if (root.data.equals(element)) {
				return root;
			} else {
				TreeNode res;
				if (root.sibling != null) {
					res = getNode(root.sibling, element);
					if (res != null && element.equals(res.data))
						return res;
				}
				if (root.child != null) {
					res = getNode(root.child, element);
					if (res != null && element.equals(res.data))
						return res;
				}

			}
		}
		return null;
	}

	boolean flag = false;
	int level = 0;

	public void getClosestPeer(TreeNode root, String input) {
		if (root != null) {
			if (root.data.equals(input) && !flag) {
				if (root.sibling != null) {
					System.out.println("Closest peer: " + root.sibling.data);
					return;
				} else {
					flag = true;
					level++;
					getClosestPeer(root.parent, input);
				}

			} else if (flag) {
				if (root.sibling != null) {
					level--;
					getClosestPeer(root.sibling, input);
				}
				if (root.child != null) {
					if (level == 0) {
						System.out.println("Closest peer: " + root.child.data);
						System.exit(0);
					} else {
						level++;
						getClosestPeer(root.parent, input);
					}
				}

			} else if (!flag) {
				if (root.child != null)
					getClosestPeer(root.child, input);
				if (root.sibling != null)
					getClosestPeer(root.sibling, input);
			}

		}

	}

	public void print(TreeNode root) {
		if (root != null) {
			System.out.println(root.data);
			if (root.parent != null)
				System.out.println("parent: " + root.parent.data);
			if (root.sibling != null)
				System.out.println("sibling: " + root.sibling.data);
			if (root.sibling != null)
				print(root.sibling);
			print(root.child);
		}
	}

	public static void main(String[] args) {
		TreeClosestPeer tp = new TreeClosestPeer();
		//int level = 0;
		tp.insert("A", true);
		tp.insert("B", true);
		tp.insert("C", true);
		tp.insert("D", true);
		tp.insert("E", false);

		tp.addSibling("C", "F");
		tp.insert("F", true);
		tp.insert("G", false);
		tp.addSibling("B", "H");
		tp.insert("H", true);
		tp.insert("I", false);

		tp.addSibling("I", "J");
		tp.insert("J", true);
		tp.insert("K", false);

		tp.addSibling("H", "L");
		tp.insert("L", true);
		tp.insert("M", true);
		tp.insert("N", true);
		tp.insert("O", false);
		tp.addParentLink("H", "A");
		tp.addParentLink("L", "A");
		tp.addParentLink("J", "H");
		tp.addParentLink("F", "B");
		tp.getClosestPeer(tp.root, "E");
		
		tp.print(tp.root);
	}

}
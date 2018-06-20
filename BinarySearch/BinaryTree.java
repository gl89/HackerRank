public class BinaryTree {
	Node root;

	void insert(int key) {
		root = insert(root, key);
	}

	static Node insert(Node p, int key) {
		// insert into the binary tree with root p,
		// and returns a reference to the new tree.
		if (p == null)
			p = new Node(key);
		else {
			if (key < p.data)
				p.left = insert(p.left, key);
			else if (key > p.data)
				p.right = insert(p.right, key);
		}
		return p;
	}

	static int search1(Node p, int key) {
		if (p == null)
			return 0;
		if (p.data == key)
			return 1;
		else if (key < p.data)
			search1(p.left, key);
		else if (p.data < key)
			search1(p.right, key);
		return 0; // statement never reached
	}

	static int search2(Node p, int key) {
		if (p == null)
			return 0;
		if (p.data == key)
			return 1;
		else if (key < p.data)
			return search2(p.left, key);
		else if (p.data < key)
			return search2(p.right, key);
		return 0; // statement never reached
	}

	public static void main(String[] args) {
		// Node n=new Node(42);
		// System.out.println(n+" "+n.left+" "+n.right);
		BinaryTree b = new BinaryTree();
		int[] input = { 5, 2, 6, 4, 7, 8, 1, 3, 11, 32, 21, 34, 55, 16 };
		for (int v : input)
			b.insert(v);

		System.out.println("NORETURN STATEMENTS");
		System.out.println(search1(b.root, 16));
		System.out.println(search1(b.root, 10000));
		System.out.println(search1(b.root, 21));
		System.out.println(search1(b.root, 55));

		System.out.println();

		System.out.println("RETURN STATEMENTS");
		System.out.println(search2(b.root, 16));// 1
		System.out.println(search2(b.root, 10000));
		System.out.println(search2(b.root, 21));
		System.out.println(search2(b.root, 55));

	}
}
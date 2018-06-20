import java.util.*;

public class BinaryTreeConversion {

	TreeNode root;
	static TreeNode prev = null;

	void insert(int key) {
		root = insert(root, key);
	}

	static TreeNode insert(TreeNode p, int key) {
		// insert into the binary tree with root p,
		// and returns a reference to the new tree.
		if (p == null)
			p = new TreeNode(key);
		else {
			if (key < p.data)
				p.left = insert(p.left, key);
			else if (key > p.data)
				p.right = insert(p.right, key);
		}
		return p;
	}

	static void flatten(TreeNode root) {// preorder
		if (root == null)
			return;
		flatten(root.right);
		flatten(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
	}

	static void flat_order(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		flat_order(root.right);

	}

	public static void main(String[] args) {

		BinaryTreeConversion bt = new BinaryTreeConversion();
		int[] input = { 10, 6, 9, 5, 15, 14, 17 };
		for (int v : input)
			bt.insert(v);

		bt.flatten(bt.root);
		bt.flat_order(bt.root);
	}
}
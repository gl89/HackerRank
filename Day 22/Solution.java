/*
Gabriel Loterena
8/3/2016
Day 22 Find the height of the tree
*/
public class Solution {
	public static int getHeight(Node root) {
		if (root == null)
			return 0;
		if (root.left != null)
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		if (root.right != null)
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		return 0;
	}
}
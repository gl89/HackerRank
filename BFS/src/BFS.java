import java.util.*;

public class BFS {
	
	static Node insert(Node root,int key){
		if(root==null) 
			root = new Node(key);
		else {
			if(key>root.data){
				root.right=insert(root.right,key);
			}else if(key<root.data){
				root.left=insert(root.left,key);
			}
		}
		
		return root;
	}
	
	static void preOrder(Node root){
		if(root!=null){
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		}
	}
		
	static void inOrder(Node root){
		if(root!=null){
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		}
	}
	
	static void postOrder(Node root){
		if(root!=null){
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		}
	}
	
	static void BreadthFS(Node root){
		Queue<Node> q = new LinkedList<Node>();
		if(root == null) 
			return;
		q.add(root);
		while(!q.isEmpty()){
			Node p = (Node)q.remove();
			System.out.print(p.data+" ");
			if(p.left!=null){
				q.add(p.left);
			}
			if(p.right!=null){
				q.add(p.right);
			}
		}	
	}
	
	static void printLeaves(Node root){
		if(root == null) 
			return;
		if(root.left==null&&root.right==null){
			System.out.print(root.data+" ");
		}
		printLeaves(root.left);
		printLeaves(root.right);
	}
	
	static int countLeaves(Node root){
		if(root == null) 
			return 0;
		if(root.left==null&&root.right==null){
			return 1;
		}else {
			return countLeaves(root.left) + countLeaves(root.right);
		}		
	}
	
	
	public static void main(String[] args){
		Node root = new Node(10);
		Node head = root;
		
		BFS.insert(root,3);
		BFS.insert(root,11);
		BFS.insert(root,13);
		BFS.insert(root,12);
		BFS.insert(root,2);
		
		
		System.out.println("preOrder");
		BFS.preOrder(head);
		System.out.println();
		System.out.println("postOrder");
		BFS.postOrder(head);
		System.out.println();
		System.out.println("inOrder");
		BFS.inOrder(head);
		System.out.println();
		System.out.println("BFS");
		BFS.BreadthFS(head);
		System.out.println();
		System.out.println("BFS");
		BFS.printLeaves(head);
		System.out.println();
		System.out.println("BFS");
		System.out.println(BFS.countLeaves(head)+" Leaves");
		
	}

}

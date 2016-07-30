/*Gabriel Loterena
7/25/2016
Binary Tree practice
*/

import java.util.*;

public class BinaryTree{
   Node root;
   
   void insert(int key){root=insert(root,key);}
   
   static Node insert(Node p, int key){
      // insert into the binary tree with root p,
      // and returns a reference to the new tree.
      if(p==null) p=new Node(key);
      else{
         if(key<p.data) p.left=insert(p.left,key);
         else if(key>p.data) p.right=insert(p.right,key);
      }
      return p;
   }
   
   
   //The tree DFS methods, always left process left sub tree before right subtree.
   static void inorder(Node root){
      if(root==null)
         return;
      inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);    
   }
   
   static void preorder(Node root){
      if(root==null)
         return;
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);
   }
   
   static void postorder(Node root){
      if(root==null)
         return;
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data+" ");
   }
   
   //Queues process FIFO, so in this case LEFT to right
   static void BFS(Node root){
      Queue<Node> q = new LinkedList<Node>();
      if(root==null)
         return;
      q.add(root);
      while(!q.isEmpty()){
         Node n = (Node)q.remove();
         System.out.print(n.data+ " ");
         if(n.left!=null)           
           q.add(n.left);
         if(n.right!=null)
           q.add(n.right);
      }
   }
   
  static void BFSearch(Node root,int key){
      Queue<Node> q = new LinkedList<Node>();
      if(root==null)
         return;
      q.add(root);
      while(!q.isEmpty()){
         Node n = (Node)q.remove();
         System.out.print(n.data+ " ");
         if(n.data==key){
            System.out.println(key + " Found in tree.");
            return;
         }
         if(n.left!=null)           
           q.add(n.left);
         if(n.right!=null)
           q.add(n.right);
      }
      System.out.println(key + " Not Found in tree.");
   }
   
   
   static void found(Node p, int key){
      if(search(p,key)==1){
         System.out.println(key + " was found in tree.");
      }else{
         System.out.println(key + " was not found in tree.");
      }
   }
    
   static int search(Node p, int key){
      if(p==null) return 0;
      if(p.data==key) return 1;
      else if(key<p.data) return search(p.left,key);
      else if(p.data<key) return search(p.right,key);
      return 0; // statement never reached
   } 
   
   void top_view(Node root){
    left(root.left);
    System.out.print(root.data+" ");
    right(root.right);
   }

   void left(Node p){
      if(p==null)
          return;
      left(p.left);
      System.out.print(p.data+" ");
   }
    
   void right(Node p){
      if(p==null)
          return;
      System.out.print(p.data+" ");
      right(p.right);
   }
   
   static void Leaves(Node p){
      if(p==null)
         return;
      if(p.left==null && p.right==null){
         System.out.print(p.data+" ");
      }
      Leaves(p.left);
      Leaves(p.right);
   }
   
   static int CountLeaves(Node p){
      if(p==null)
         return 0;
      if(p.left==null && p.right==null)
         return 1;
      else 
         return CountLeaves(p.left)+CountLeaves(p.right);
   }
   
   public static String checkBalance(Node root){
		int result = isBalanced(root);
		if(result>0){
			return "tree is balanced.";
		}else{
			return "tree is not balanced.";
		}
	}
   
   static int height(Node root){
      if(root==null)
         return -1;//you don't count root as part of the height
      return 1+Math.max(height(root.left),height(root.right));
    }

   public static int isBalanced(Node root){
		if(root==null){
			return 0;
		}
		int leftH = isBalanced(root.left);
		if(leftH==-1){
			return -1;
		}
		int rightH = isBalanced(root.right);
		if(rightH==-1){
			return -1;
		}
		int diff = leftH-rightH;
		if(Math.abs(diff)>1){
			return -1;
		}
		return 1 + Math.max(leftH, rightH);
	}

 
    /* Returns true if given search tree is binary
       search tree (efficient version) */
    static boolean isBST(Node node){
        Node prev = node;
        // traverse the tree in inorder fashion and
        // keep a track of previous node
        if (node != null){
            if (!isBST(node.left))
                return false;
            // allows only distinct values node
            if (prev != null && node.data <= prev.data )
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;
   }
   
   public static void main(String[] args){
      // Node n=new Node(42);
      // System.out.println(n+" "+n.left+" "+n.right);
      BinaryTree b=new BinaryTree();
      int[] input={5,2,6,4,7,8,1,3,11,32,21,34,55,16};
      for(int v: input) 
         b.insert(v);
         
      BinaryTree c=new BinaryTree();
      int[] input1={5,4,6};
      for(int v: input1) 
         c.insert(v);
         
      found(b.root,5);
      found(b.root,10);
      BFSearch(b.root,5);
      BFSearch(b.root,10);
      System.out.print("Inorder ");
      inorder(b.root);
      System.out.println();
      System.out.print("Preorder ");
      preorder(b.root);
      System.out.println();
      System.out.print("Postorder ");
      postorder(b.root);
      System.out.println();
      System.out.print("BFS ");
      BFS(b.root);
      System.out.println();
      System.out.println("Leaves of this tree");
      Leaves(b.root);
      System.out.println();
      System.out.print("The number of leaves " + CountLeaves(b.root));
      System.out.println();
      System.out.println("Check height");
      System.out.println("b " + checkBalance(b.root));
      System.out.println("c "  + checkBalance(c.root));
      System.out.println("Height");
      System.out.println(height(b.root));
      System.out.println(isBST(b.root));
   }
}
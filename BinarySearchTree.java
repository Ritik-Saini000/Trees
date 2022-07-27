class Node{
		int data;
		Node left, right;
		Node(int val){
			data=val;
			left=null;
			right=null;
		}
	}
public class BinarySearchTree {

	static Node insertBST(Node root,int val) {
		if(root==null) {
			return new Node(val);
		}
		if(val<root.data) {
			root.left=insertBST(root.left,val);
		}
		else {
			//val>root.data
			root.right=insertBST(root.right,val);
		}
		return root;
	}
	
	static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root=null;
		root=insertBST(root,45);
		insertBST(root,30);
		insertBST(root,50);
		insertBST(root,25);
		insertBST(root,35);
		insertBST(root,45);
		insertBST(root,60);
		insertBST(root,4);
		
		//print inorder
		inorder(root);
		System.out.println();
	}

}

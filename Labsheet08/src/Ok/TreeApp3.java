package Ok;

public class TreeApp3 {
	 
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.createTree5();
		tree.printTree(tree.getRoot(), 0);
		
//		System.out.println();
//		tree.searchDeleteNode(14);
//		System.out.println("Delete Node = "+ tree.getDeleteNode().data);
//		System.out.println("Parent = " + tree.getParent().data);
		System.out.println("------------------------------------------------");
		
		
		int target =70;
		tree.delete(target);
		tree.printTree(tree.getRoot(),0);
	}
 
}
 
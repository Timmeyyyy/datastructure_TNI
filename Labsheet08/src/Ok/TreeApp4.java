package Ok;

import java.util.Scanner;

public class TreeApp4 {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		Scanner sc = new Scanner(System.in);
		System.out.print("Target = ");
        int target = sc.nextInt();
		
		tree.findNode(target);
		
		if (tree.getFoundNode() == null) System.out.println("Cannot found Node(data=["+target+"])");
		else {
			System.out.println((tree.getFoundNode().left != null)?tree.getFoundNode().left.data:"No Left Child");
			System.out.println((tree.getFoundNode().right != null)?tree.getFoundNode().right.data:"No Right Child");
			System.out.println((tree.getFoundNode().left == null)&&(tree.getFoundNode().right == null)?"["+target+"]"+" is Leaf Node":"["+target+"]"+" is not Leaf Node");
		}
		
	}

}

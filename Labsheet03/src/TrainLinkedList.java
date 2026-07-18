
public class TrainLinkedList {

	public static void main(String[] args) {
		LinkedList station = new LinkedList();
		
		station.insert(0,"Sanam-Pao");
		station.insert(0,"Ari");
		station.insert(0,"Mo-chit");
		System.out.println("All Station : "+station.traversal());
		
		station.insert(2, "Rachakru");
		System.out.println("All Station : "+station.traversal());
		System.out.println("Total Station : "+station.length());
		
		System.out.println("First Station : "+station.get(0));
		
		station.set(0, "Mo-chit (Central Ladprao)");
		System.out.println("All Station : "+station.traversal());
		station.remove(2);
		System.out.println("All Station : "+station.traversal());
		station.removeLastElement();
		System.out.println("All Station : "+station.traversal());
		station.clear();
		System.out.println("Total Station : "+station.length());
		System.out.println("All Station : "+station.traversal());

	}

}

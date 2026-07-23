
public class TodoList {
	public static void main(String[] args) {
		
		DoublyLinkedList TodoList = new DoublyLinkedList();
		
		TodoList.insert("Finish Homework");
		TodoList.insert("Laundry");
		TodoList.insert("Group Meeting");	
		System.out.println(TodoList.traversal());
		
		TodoList.insert(0,"Submit Report");
		System.out.println(TodoList.traversal());
		
		TodoList.insert(2,"Buy Food");
		System.out.println(TodoList.traversal());
		
		TodoList.insert("Go to Gym");
		System.out.println(TodoList.traversal());
		
		TodoList.remove();
		System.out.println(TodoList.traversal());
		
		TodoList.remove(2);
		System.out.println(TodoList.traversal());
		
		TodoList.remove(0);
		System.out.println(TodoList.traversal());
		
		
	}
}

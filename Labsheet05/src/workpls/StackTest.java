package workpls;

public class StackTest {
	public static void main(String[] args) {
		StackArrayBased stacks = new StackArrayBased(5);
		stacks.push(10);
		stacks.push(11);
		stacks.push(12);
		
		
		System.out.println(stacks.peek()); //12
		System.out.println(stacks.pop());  //12
		System.out.println(stacks.peek()); //11
	}
}

package Pls;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		for (int i = 101; i <= 105; i++) {
			queue.add(i);
			System.out.println("Enqueue : " + i);
		}
		
		System.out.println("Queue => " + queue);
		System.out.println();
		
		while (queue.isEmpty() == false) {
			System.out.println("Calling number: " + queue.peek());
			System.out.println("Providing service number: " + queue.poll());
			System.out.println();
		}
		
		System.out.println("Queue => " + queue);
		
	}
}
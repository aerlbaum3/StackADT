package LinkedListADTStack;

public class TestString {
	public static void main(String[] args) {
		StackImplementation <String> LinkedList = new StackImplementation();
		
		LinkedList.push("Happy");
		LinkedList.push("Sad");
		LinkedList.push("Excited");
		LinkedList.push("Angry");
		LinkedList.push("Scared");
		
		//I should have 5 elements
		System.out.println("There are " + LinkedList.size() + " emotions in my stack.");
		
		LinkedList.pop();
		System.out.println("Now there are " + LinkedList.size() + " emotions.");
		System.out.println("I popped the emotion " + LinkedList.pop());
		System.out.println("Now I have " + LinkedList.size() + " emotions left.");
		
		//Peeking onto the top of the stack
		System.out.println("Now I am peekin onto my stack:");
		System.out.println("I am peeking at " + LinkedList.peek() + ".");
		
		
	}
}

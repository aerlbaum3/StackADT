package LinkedListADTStack;

public class TestInt {
	public static void main(String [] args) {
		StackImplementation testInt = new StackImplementation();
		testInt.push(2);
		testInt.push(4);
		testInt.push(6);
		testInt.push(7);
		testInt.push(-1);
		
		//Size of stack now
		System.out.println("The size of the stack is " + testInt.size());
		
		testInt.pop();
		testInt.pop();
		//the size of the stack should be 3 now
		System.out.println("The size of the stack now is: " + testInt.size());
		
		System.out.println("I am now popping element " + testInt.pop() + ".");
		
		System.out.println("I have " + testInt.size() + " elements left.");
		
		//Im now peeking at element 4
		System.out.println("I am peeking at element " + testInt.peek());
	}
	
}

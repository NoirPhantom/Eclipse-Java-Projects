
public class Array {
	int[] stackArray = new int[5];
	int top = -1;
	// Checking stack if empty
	boolean isEmpty() {
		return top ==-1;
	}
	
	// Checking if stack is full
	boolean isFull() {
		return top == stackArray.length -1;
	}
	
	// Inserting a number into stack while checking if stack is full or still has space
	boolean push(int value) {
		if (this.isFull()) {
			return false;
		}
		else {
			this.stackArray[++this.top] = value;
			return true;
		}
	}
	
	// Removing top number is stack
	int pop() {
		if (this.isEmpty()) {
			return 0;
		}
		else {
			return this.stackArray[top--];
		}
	}
	
	// Returns the amount of elements within the stack
	int count() {
		return this.top + 1;
	}
	
	// Returns the value of the top most element within the stack without removing or modifying the stack
	int peek () {
		if (this.isEmpty()) {
			return 0;
		} 
		else {
			return this.stackArray[top];
		}
	}
	
	// Displays all elements in the stack
	void display() {
		for (int i = top; i >=0; i--) {
			System.out.println(this.stackArray[i]);
		}
	}
}

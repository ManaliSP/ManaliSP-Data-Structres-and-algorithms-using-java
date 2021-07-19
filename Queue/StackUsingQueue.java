import java.util.*;
import java.util.Scanner;

class StackUsingQueue {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Stack stack = new Stack();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch(choice) {
				case 1:
					input = s.nextInt();
					stack.push(input);
					break;

				case 2:
					System.out.println(stack.pop());
					break;

				case 3:
					System.out.println(stack.top());
					break;

				case 4:
					System.out.println(stack.getSize());
					break; 

				default: 
					System.out.println((stack.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}

}
class Stack {

    //Define the data members
	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int size;

    public Stack() {
        //Implement the Constructor
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        	size++;
  
            // Push x first in empty q2
            q2.add(element);
  
            // Push all the remaining
            // elements in q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
  
            // swap the names of two queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
    }

    public int pop() {
        //Implement the pop() function
        if (q1.isEmpty())
                return -1;
        int temp = q1.poll();
        size--;
        return temp;
        
    }

    public int top() {
        //Implement the top() function
        if (q1.isEmpty())
                return -1;
        return q1.peek();
    }
}
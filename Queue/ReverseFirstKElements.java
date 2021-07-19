import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Solution {
    
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
        if (input.isEmpty() == true
            || k > input.size())
            return input;
        if (k <= 0)
            return input;
 
        Stack<Integer> stack = new Stack<Integer>();
 
        // Push the first K elements into a Stack
        for (int i = 0; i < k; i++) {
            stack.push(input.peek());
            input.remove();
        }
 
        // Enqueue the contents of stack
        // at the back of the queue
        while (!stack.empty()) {
            input.add(stack.peek());
            stack.pop();
        }
 
        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.peek());
            input.remove();
        }
        return input;
    }
}

class Input {
	int n;
	int k;
	Queue<Integer> queue;

	public Input(int n, int k, Queue<Integer> queue) {
		this.queue = queue;
		this.n = n;
		this.k = k;
	}

}
class ReverseFirstKElements {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Input takeInput() throws NumberFormatException, IOException {
    	String[] n_k = br.readLine().trim().split(" ");

    	int n = Integer.parseInt(n_k[0]);
    	int k = Integer.parseInt(n_k[1]);

    	String[] values = br.readLine().trim().split(" ");

    	Queue<Integer> queue = new LinkedList<>();

    	for (int i = 0; i < n; i++) {
    		queue.add(Integer.parseInt(values[i]));
    	}

    	return new Input(n, k, queue);

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	Input input = takeInput();

    	int n = input.n;
    	int k = input.k;
    	Queue<Integer> queue = input.queue;

    	queue = Solution.reverseKElements(queue, k);


    	while (!queue.isEmpty()) {
    		System.out.print(queue.poll() + " ");
    	}
    }
}
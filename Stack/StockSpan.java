import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Solution {
	public static int[] stockSpan(int[] price) {
		//Your code goes here
        // Create a stack and push index of first element 
        // to it 
        Stack<Integer> st = new Stack<>(); 
        st.push(0); 
  		int[] S=new int[price.length];
        // Span value of first element is always 1 
        S[0] = 1; 
  
        // Calculate span values for rest of the elements 
        for (int i = 1; i < price.length; i++) { 
  
            // Pop elements from stack while stack is not 
            // empty and top of stack is smaller than 
            // price[i] 
            while (!st.empty() && price[st.peek()] < price[i]) 
                st.pop(); 
  
            // If stack becomes empty, then price[i] is 
            // greater than all elements on left of it, i.e., 
            // price[0], price[1], ..price[i-1]. Else price[i] 
            // is greater than elements after top of stack 
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek()); 
  
            // Push this element to stack 
            st.push(i); 
        }
    return S;
	}
}
public class StockSpan {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws NumberFormatException, IOException {
    	int size = Integer.parseInt(br.readLine().trim());
    	int[] input = new int[size];

    	if (size == 0) {
    		return input;
    	}

    	String[] values = br.readLine().trim().split(" ");

    	for(int i = 0; i < size; i++) {
    		input[i] = Integer.parseInt(values[i]);
    	}

    	return input;
    }

    public static void printArray(int[] arr) {
    	for (int i = 0 ; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}

    	System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	int[] input = takeInput();

    	int[] output = Solution.stockSpan(input);

    	printArray(output);

    }
}
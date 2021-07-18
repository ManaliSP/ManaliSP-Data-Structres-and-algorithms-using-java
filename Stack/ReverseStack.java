import java.util.*;
class ReverseStack
{
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) 
    {
		//Your code goes here
        if(input.size()==0 ||extra.size()==1 )
        {  return;}
        
        int temp=input.pop();
        
        reverseStack(input,extra);
        
        while(!input.isEmpty()) {
		extra.push(input.pop());
		}	
        
        input.push(temp);
        
        while(!extra.isEmpty()) {
		input.push(extra.pop());
		}
	}
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        int arr[] = {6,5,4,3,2,1};
        for(int i = 0; i< arr.length; i++)
        {
            stack.push(arr[i]);
        }
        reverseStack(stack,helper);
        while(! stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
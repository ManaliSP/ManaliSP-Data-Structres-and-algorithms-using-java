import java.util.*;
class CollectionsStack
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = {6,5,4,3,2,1};
        for(int i = 0 ; i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        while(! stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
        // stack.push(10);
        // System.out.println(stack.size());
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.isEmpty());
    }
}
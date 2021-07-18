import java.util.*;
class StackUsingArray
{
    private int data[];
    private int topIndex;
    StackUsingArray()
    {
        data = new int[5];
        topIndex = -1;
    }
    StackUsingArray(int size)
    {
        data = new int[size];
        topIndex = -1;
    }
    void push(int elem)
    {
        if(topIndex ==  data.length - 1)
        {
            doubleCapacity();
        }
        topIndex++;
        data[topIndex] = elem;
    }
    private void doubleCapacity()
    {
        System.out.println("Capacity Doubled");
        int prevStack[] = data;
        data = new int[2 * prevStack.length-1];
        for(int i = 0; i< prevStack.length;i++)
        {
            data[i] = prevStack[i];
        }
    }
    int top()
    {
        if(topIndex == -1)
        {
            System.out.println("Stack is Empty.");
        }
        return data[topIndex];
    }
    int pop()
    {
        if(topIndex == -1)
        {
            System.out.println("UnderFlow");
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
    int size()
    {
        return topIndex + 1 ;
    }
    boolean isEmpty()
    {
        if(topIndex == -1)
        {
            return true;
        }else{
            return false;
        }
    }
}
class StackUsingArrayMain
{
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        int arr[] = {6,5,4,3,2,1};
        for(int i = 0; i< arr.length; i++)
        {
            stack.push(arr[i]);
        }
        while(! stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        // Scanner sc =  new Scanner(System.in);
        // int elem = sc.nextInt();
        // stack.push(10);
        // stack.size();
        // stack.pop();
        // System.out.println(stack.top());
        // System.out.println(stack.isEmpty());
    }
}
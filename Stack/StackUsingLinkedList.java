class Node<T>
{
    T data;
    Node next;
    Node(T data)
    {
        this.data = data;
    }
}
class StackUsingLinkedList<T>
{
    private Node<T> head;
    private int size;
    StackUsingLinkedList()
    {
        head = null;
        size = 0 ;
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        return size==0;
    }
    void push(T elem)
    {
        Node<T> newNode = new Node<>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }
    T top()
    {
        return head.data;
    }
    T pop()
    {
        if(head == null)
        {
            System.out.println("Stack is Empty.");
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
class StackUsingLinkedListMain
{
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        int arr[] = {6,5,4,3,2,1};
        for(int i = 0 ; i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        while(! stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
    }
}
class Node<T>
{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data = data;
        next = null;
    }
}
class QueueUsingLinkedList<T>
{
    private Node<T> front;
    private Node<T> rear;
    int size;
    QueueUsingLinkedList()
    {
        front = null;
        rear = null;
        size = 0;
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        return size == 0;
    }
    void enqueue(T elem)
    {
        Node<T> newNode = new Node<>(elem);
        if(rear == null)
        {
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = rear.next;
        }
        size++;
    }
    T front()
    {
        if(front == null)
        {
            System.out.println("Queue is empty.");
        }
        return front.data;
    }
    T dequeue()
    {
        if(front == null)
        {
            System.out.println("Queue is empty.");
        }
        T temp = front.data;
        front = front.next;
        if(front == null)
        {
            rear = null;
        }
        size--;
        return temp;
    }
}
class QueueUsingLinkedListMain
{
    public static void main(String[] args) {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        int arr[] = {1,2,3,4,5,6};
        for(int i = 0; i<arr.length;i++)
        {
            queue.enqueue(arr[i]);
        }
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        while(! queue.isEmpty())
        {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
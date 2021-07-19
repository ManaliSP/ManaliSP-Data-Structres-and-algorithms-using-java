class QueueUsingArray
{
    private int data[];
    private int front;
    private int rear;
    private int size;
    QueueUsingArray()
    {
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }
    QueueUsingArray(int capacity)
    {
        data = new int[capacity];
        front = -1;
        rear = -1;
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
    void enqueue(int elem)
    {
        if(size == data.length -1)
        {
            System.out.println("Queue is full.");
        }
        if(size == 0)
        {
            front = 0;
        }
        rear++;
        data[rear] = elem;
        size++;
    }
    int front()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty.");
        }
        return data[front];
    }
    int dequeue()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty.");
        }
        int temp = data[front];
        front++;
        size--;
        if(size == 0)
        {
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
class QueueUsingArrayMain
{
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(20);
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
        //queue.enqueue(10);
    }
}
class CircularQueueUsingArray
{
    private int data[];
    private int front;
    private int rear;
    private int size;
    CircularQueueUsingArray()
    {
        data = new int[4];
        front = -1;
        rear = -1;
        size = 0;
    }
    CircularQueueUsingArray(int capacity)
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
    private void doubleCapacity()
    {
        System.out.println("Capacity Doubled.");
        int temp[] = data;
        data = new int[2 * temp.length-1];
        int index = 0;
        for(int i = front; i < temp.length; i++)
        {
            data[index++] = temp[i];
        }
        for(int i = 0; i < front -1; i++)
        {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }
    void enqueue(int elem)
    {
        if(size == data.length -1)
        {
            doubleCapacity();
        }
        if(size == 0)
        {
            front = 0;
        }
        // rear++;
        // if(rear == data.length)
        // {
        //     rear = 0;
        // }
        rear = (rear + 1) % data.length;
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
        // front++;
        // if(front == data.length)
        // {
        //     front = 0;
        // }
        front = (front + 1) % data.length;
        size--;
        if(size == 0)
        {
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
class CircularQueueUsingArrayMain
{
    public static void main(String[] args) {
        CircularQueueUsingArray queue = new CircularQueueUsingArray();
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
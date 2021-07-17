class Node<T>
{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data = data ;
        // next = null ;
    }
}

class LinkedListDemo
{
    static Node<Integer> createLinkedList()
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    static void printLinkedList(Node<Integer> head)
    {
        Node<Integer> temp = head;
        // System.out.println(temp.data);
        // System.out.println(temp.next.data);
        // System.out.println(temp.next.next.data);
        // System.out.println(temp.next.next.next.data);
        // System.out.println(temp.next.next.next.next.data);
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        //System.out.println(n1.next);

    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        printLinkedList(head);
        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
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
class IncrementElement
{
    static Node<Integer> createLinkedList()
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        n1.next = n2;
        n2.next = n3;
        return n1;

    }
    static void printLinkedList(Node<Integer> head)
    {
        Node<Integer> temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static void incrementElement(Node<Integer> head)
    {
        Node<Integer> temp = head ;
        while(temp != null)
        {
            temp.data++;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        incrementElement(head);
        printLinkedList(head);
    }
}
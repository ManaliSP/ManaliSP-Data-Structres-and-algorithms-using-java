class PrintIthNode
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
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    static void printIthNode(Node<Integer> head, int i)
    {
        Node<Integer> temp = head;
        for(int j = 0; j <= i && temp != null; j++)
        {
            if(j==i)
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        int i = 2;
        printIthNode(head,i);
        printLinkedList(head);
    }
}
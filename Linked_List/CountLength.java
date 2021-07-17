class CountLength
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
    static int length(Node<Integer> head)
    {
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        int lengthLL = length(head);
        System.out.println(lengthLL);
    }
}
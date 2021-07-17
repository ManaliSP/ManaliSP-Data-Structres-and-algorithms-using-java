class InsertRecursive
{
    static Node<Integer> insertRecursive(Node<Integer> head, int data, int pos)
    {
        if(head == null && pos > 0)
        {
            return head;
        }
        if(pos == 0)
        {
            Node<Integer> newNode = new Node<>(data);
            newNode.next = head;
            return newNode;
        }
        else{
            head.next = insertRecursive(head.next, data, pos-1);
            return head;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        head = insertRecursive(head,20,5);
        TakeInput1.printLinkedList(head);
    }
}
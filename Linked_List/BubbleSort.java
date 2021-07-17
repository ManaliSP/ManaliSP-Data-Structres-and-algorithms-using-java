class BubbleSort
{
    static Node<Integer> bubbleSort(Node<Integer> head)
    {
        Node<Integer> curr = head, index = null;
        int temp;
        while(curr != null)
        {
            index = curr.next;
            while(index != null)
            {
                if(curr.data > index.data)
                {
                    temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        head = bubbleSort(head);
        TakeInput1.printLinkedList(head);
    }
}
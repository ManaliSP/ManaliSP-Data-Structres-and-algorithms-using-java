class EliminateDuplicates
{
    static Node<Integer> eliminateDuplicates(Node<Integer> head)
    {
        Node<Integer> temp1 = head;
        Node<Integer> temp2 = head.next;
        if(head == null || head.next == null)
        {
            return head;
        }
        while(temp2 != null)
        {
            if(!temp1.data.equals(temp2.data))
            {
                temp1.next = temp2;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else{
                temp2 = temp2.next;
            }
        }
        temp1.next = temp2;
        temp1 = temp1.next;
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        head = eliminateDuplicates(head);
        TakeInput1.printLinkedList(head);
    }
}
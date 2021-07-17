class EvenAfterOdd
{
    static Node<Integer> evenAfterOdd(Node<Integer> head)
    {
        Node<Integer> curr = head;
        Node<Integer> oddHead = null, oddTail = null;
        Node<Integer> evenHead = null, evenTail = null;
        while(curr != null)
        {
            if((curr.data & 1 ) == 0)  // even
            {
                if(oddHead == null)
                {
                    oddHead = oddTail = curr;
                }else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }else{
                if(evenHead == null)
                {
                    evenHead = evenTail = curr;
                }else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            curr = curr.next;
        }
        if(evenHead != null)
        {
            head = evenHead;
            evenTail.next = oddHead;
        }else{
            head = oddHead;
        }
        if(oddTail != null)
        {
            oddTail.next = null;
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        head = evenAfterOdd(head);
        TakeInput1.printLinkedList(head);
    }
}
class MergeTwoSortedLL
{
    static Node<Integer> mergeTwoSortedLL(Node<Integer> head1 , Node<Integer> head2)
    {
        if (head1 == null && head2 == null){
            return head1;
        }
        if (head1 == null && head2 !=null){
            return head2;
        }
        if (head2 == null && head1 != null){
            return head1;
        }
        Node<Integer> head = null;
        Node<Integer> tail = null;  
        if (head1.data <= head2.data){
            head = head1;
            tail = head1;
            head1 = head1.next;
        }
        else{
            head = head2;
            tail = head2;
            head2 = head2.next;
        }
        while(head1 != null && head2 != null){
        	if (head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if(head1 != null){
            tail.next = head1;
        }
        else if (head2 != null){
            tail.next = head2;
        }
        // return new Node<Integer>(10);
        return head;    
    }
    public static void main(String[] args) {
        Node<Integer> head1 = TakeInput1.takeInputOptimized();
        Node<Integer> head2 = TakeInput1.takeInputOptimized();
        head1 = mergeTwoSortedLL(head1,head2);
        TakeInput1.printLinkedList(head1);
    }
}
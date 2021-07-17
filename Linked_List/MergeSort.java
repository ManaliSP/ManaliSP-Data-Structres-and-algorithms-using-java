class MergeSort
{
    public static Node<Integer> mid(Node<Integer>head)
	{
	    Node<Integer>fast=head.next;
		Node<Integer>slow=head;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow; //slow will always point to the left mid in case of even no. of nodes in the linked list
	}
    public static Node<Integer> mergeSortedLL(Node<Integer>firstHead,Node<Integer>secondHead)
    {
		Node<Integer>newHead=null;
		Node<Integer>sorting=null;
		if(firstHead==null)
        {
			return secondHead;
        }
		else
			if(secondHead==null)
            {
				return firstHead;
            }
			else
			{
				if(firstHead.data<=secondHead.data)
				{
				    sorting=firstHead;
					firstHead=firstHead.next;
				}
				else
				{
					sorting=secondHead;
					secondHead=secondHead.next;
				}
				newHead=sorting;
				while(firstHead!=null&&secondHead!=null)
				{
					if(firstHead.data<=secondHead.data)
					{
						sorting.next=firstHead;
						sorting=firstHead;
						firstHead=firstHead.next;
					}
					else
					{
						sorting.next=secondHead;
						sorting=secondHead;
						secondHead=secondHead.next;
					}
				}
				if(firstHead==null)
				{
					sorting.next=secondHead;
				}
				else if(secondHead==null)
				{
					sorting.next=firstHead;		
				}
				return newHead;		
			}
	}
    public static Node<Integer> mergeSort(Node<Integer> head) 
    {
		//Your code goes here
	    if(head==null||head.next==null)
		{
			return head;
		}
		//do not use the list splitting method used in palindrome since the middle node will be lost;
		Node<Integer>mid=mid(head);
	    Node<Integer>firstHalfTail=mid;
		Node<Integer>secondHalfHead=mid.next;
		firstHalfTail.next=null;
	    Node<Integer>head1=mergeSort(head);
		Node<Integer>head2=mergeSort(secondHalfHead);
		Node<Integer>mergedListHead=mergeSortedLL(head1, head2);
		return mergedListHead;
	}
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        head = mergeSort(head);
        TakeInput1.printLinkedList(head);
    }
}
import java.util.*;
class AppendLastNToFirst
{
    public static int length(Node<Integer>head){
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
        if (head == null || n == 0){
            return head;
        }
		Node<Integer>temp1=head;
		Node<Integer>temp2=head;
		int len=length(head);
		int i=0;
		while(i<len-n-1)
		{
			temp1=temp1.next;
			i++;
		}
		head=temp1.next;
		temp1.next=null;
		Node<Integer>tempHead=head;
		while(tempHead.next!=null)
		{
			tempHead=tempHead.next;
		}
		tempHead.next=temp2;
		return head;
	}

    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        head = appendLastNToFirst(head, n);
        TakeInput1.printLinkedList(head);
    }
}
import java.util.*;
class FindNodeRecursive
{
    public static int i = 0;
    static int findNodeRecursive(Node<Integer> head, int data)
    {
        if(head == null)
        {
            return -1;
        }
        Node<Integer> temp = head;
        if(temp.data == data)
        {
            return i;
        }
        i++;
        return findNodeRecursive(temp.next, data);
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int pos = findNodeRecursive(head,data);
        //TakeInput1.printLinkedList(pos);
        System.out.println(pos);
    }
}
import java.util.*;
class PalindromeLL
{
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
    static boolean palindromeLL(Node<Integer> head)
    {
        int len = length(head);
        ArrayList<Integer> list = new ArrayList<>();
        Node<Integer> temp = head;
        while(temp != null)
        {
            list.add(temp.data);
            temp = temp.next;
        }
        boolean isPalindrome=true;
        int tail = len-1;
        int i = 0;
        while(i<=tail)
        {
            if(list.get(i) != list.get(tail))
            {
                isPalindrome = false;
                return false;
            }
            i++;
            tail--;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        //TakeInput1.printLinkedList(head);
        palindromeLL(head);
        boolean isPalindrome = palindromeLL(head);
        System.out.println(isPalindrome);
    }
}
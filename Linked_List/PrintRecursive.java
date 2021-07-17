class PrintRecursive
{
    static void printRecursive(Node<Integer> head)
    {
        if(head == null)
        {
            return;
        }
        System.out.print(head.data + " ");
        printRecursive(head.next);
    }
    static void reverseRecursive(Node<Integer> head)
    {
        if(head == null)
        {
            return;
        }
        reverseRecursive(head.next);
        System.out.print(head.data + " ");
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        printRecursive(head);
        System.out.println();
        reverseRecursive(head);
    }
}
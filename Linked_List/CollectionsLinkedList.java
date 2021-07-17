import java.util.*;
class CollectionsLinkedList
{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(0,0);
        list.set(0,5);
        list.remove();
        list.addFirst(1);
        list.addLast(60);
        System.out.println("Size :" + list.size());
        System.out.println("Linked List :" + list);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
import java.util.*;
class ArraylistDemo
{
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(1,80);
        arr.set(1, 70);
        Integer i = 1;
        //arr.remove(1);
        System.out.println(arr.get(1));
        System.out.println(arr);
        System.out.println(arr.size());
        
    }
}
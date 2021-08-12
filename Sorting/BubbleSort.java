import java.util.*;
class BubbleSort
{
    public static int[] bubbleSort(int arr[])
    {
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 1; j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            return arr;
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }

        arr = bubbleSort(arr);
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(i + " ");
        }
    }
}
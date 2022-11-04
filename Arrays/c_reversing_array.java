// reversing the given array

package Data_structure.Arrays;
import java.util.Scanner;
public class c_reversing_array {

    void print(int[] arr)
    {
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void reverse_array(int[] arr, int start ,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        print(arr);
    }


    public static void main(String[] args) {
        c_reversing_array c = new c_reversing_array();
        int[] arr = new int[6];

        Scanner s = new Scanner(System.in);
        System.out.println("enter "+arr.length+" elememnts of array : ");
        for(int i = 0 ; i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        c.print(arr);
        c.reverse_array(arr,0,arr.length-1);
    }
}

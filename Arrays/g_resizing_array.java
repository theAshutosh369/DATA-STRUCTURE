// resizing the array

package Data_structure.Arrays;
import java.util.Scanner;

public class g_resizing_array {


    void print(int[] arr)
    {
        System.out.println("the array is :");
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    void resize_arr(int[] arr)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size to which array should resize :");
        n=s.nextInt();
        int[] temp = new int[n];

        for(int i=0;i<n;i++)
        {
            temp[i]=arr[i];
        }
        arr=temp;
        System.out.println("after resizing");
        print(arr);
    }

    public static void main(String[] args) {
        g_resizing_array g = new g_resizing_array();

        int[] arr = new int[6];

        Scanner s = new Scanner(System.in);
        System.out.println("enter "+arr.length+" elememnts of array : ");
        for(int i = 0 ; i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        g.print(arr);
        g.resize_arr(arr);
    }
}


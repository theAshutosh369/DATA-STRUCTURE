// finding the minimum value in the given array

package Data_structure.Arrays;
import java.util.Scanner;

public class d_finding_minimum_value_in_array {

    void print(int[] arr)
    {
        System.out.println("the array is :");
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void find_minimum(int[] arr)
    {
        int temp=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(temp>arr[i])
            {
                temp=arr[i];
            }
        }
        System.out.println("minimum value in the array is : "+temp);
    }



    public static void main(String[] args) {
        d_finding_minimum_value_in_array d = new d_finding_minimum_value_in_array();

        int[] arr = new int[6];

        Scanner s = new Scanner(System.in);
        System.out.println("enter "+arr.length+" elememnts of array : ");
        for(int i = 0 ; i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        d.print(arr);
        d.find_minimum(arr);

    }
}

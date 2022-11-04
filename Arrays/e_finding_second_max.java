// finding the second maximum of array

package Data_structure.Arrays;
import java.util.Scanner;
public class e_finding_second_max {

    void print(int[] arr)
    {
        System.out.println("the array is :");
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void second_max(int[] arr)
    {
        int max=arr[0];
        int sec_max = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!=max)
            {
                sec_max=arr[i];
            }
        }
        System.out.println("second max is : "+sec_max);
        System.out.println("max is : "+max);

    }
    public static void main(String[] args) {
        e_finding_second_max e = new e_finding_second_max();

        int[] arr = new int[6];

        Scanner s = new Scanner(System.in);
        System.out.println("enter "+arr.length+" elememnts of array : ");
        for(int i = 0 ; i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        e.print(arr);
        e.second_max(arr);
    }
}

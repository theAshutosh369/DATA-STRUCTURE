// moving the zeroes at the end of array

package Data_structure.Arrays;

import java.util.Scanner;

public class f_moving_zeroes_to_end {

    void print(int[] arr)
    {
        System.out.println("the array is :");
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    void move_zeroes(int[] arr)
    {
        int ind=0;
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i]=0;
        }
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=0)
            {
                res[ind]=arr[i];
                ind++;
            }
        }
        System.out.println("after moving zeroes to end ");
        print(res);
    }

    public static void main(String[] args) {
        f_moving_zeroes_to_end f = new f_moving_zeroes_to_end();
        int[] arr = new int[6];

        Scanner s = new Scanner(System.in);
        System.out.println("enter "+arr.length+" elememnts of array : ");
        for(int i = 0 ; i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        f.print(arr);
        f.move_zeroes(arr);

    }
}

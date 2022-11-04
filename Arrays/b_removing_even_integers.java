package Data_structure.Arrays;

import java.util.Scanner;

public class b_removing_even_integers {

    void print(int[] arr)
    {
        System.out.println("the arr is :");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void add_elements(int[] arr)
    {
        System.out.println("enter the "+ arr.length+" elemests of the array  :");
        Scanner s = new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
    }

    void remove_even(int[] arr)
    {
        int odd_no=0;
        for(int i =0;i< arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                odd_no++;
            }
        }

        int ind =0;
        int[] res = new int[odd_no];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                res[ind]=arr[i];
                ind++;
            }
        }
        System.out.println("array after removing even no.s :");
        print(res);
    }

    public static void main(String[] args) {
        b_removing_even_integers b = new b_removing_even_integers();

        int[] arr = new int[6];
        b.add_elements(arr);
        b.print(arr);

        b.remove_even(arr);


    }
}

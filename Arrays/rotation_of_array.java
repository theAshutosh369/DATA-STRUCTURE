package Data_structure.Arrays;

import java.util.Scanner;

public class rotation_of_array {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int arr[]={ 1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        System.out.print("enter the number by which array should be rotated : ");
        int d=s.nextInt();

        int temp[]=new int[d];

        // storing first d elements in temp array
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
        }

        // left shifting remaining arrays in arr
        int c=0;
        for (int i = temp.length; i < n; i++) {
            arr[c]=arr[i];
            c++;
        }

        // adding d elements at last in arr
        int m =0;
        for (int i = c; i < n; i++) {
            arr[i]=temp[m];
            m++;
        }

        // output
        System.out.println("rotated array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }

    }
}

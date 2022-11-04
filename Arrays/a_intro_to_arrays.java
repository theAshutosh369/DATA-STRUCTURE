
package DATA_STRUCTURE.Arrays;

public class a_intro_to_arrays {
    void print(int[] arr)
    {
        System.out.println("the array is :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        a_intro_to_arrays a = new a_intro_to_arrays();
        int[] arr = new int[5];

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        a.print(arr);

        arr[3]=100;
        arr[0]=499;
        a.print(arr);
//        arr[5]=400;    // gives error
//        a.print(arr);


    }
}

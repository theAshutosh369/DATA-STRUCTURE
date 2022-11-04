package Data_structure.imp_codes;

public class fibonacci_series {
    public static void main(String[] args) {
        int n=10; int f=0;int s=1;

        System.out.println("the fibonacci series is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(f+" ");
            int t = f+s;
            f=s;
            s=t;
        }

    }
}

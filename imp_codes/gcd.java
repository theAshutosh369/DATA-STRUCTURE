package DATA_STRUCTURE.imp_codes;

public class gcd
{
    static int gcd_by_recursion(int a , int b)
    {
        if (b != 0)
            return gcd_by_recursion(b,a%b);
        else
            return a;
    }

    public static void main(String[] args)
    {
        int x =4,y=14;

        // gcd by normal method
        int gcd=1;
        for (int i = 1; i <=x && i<=y; i++)
            if(x%i==0 && y%i==0) gcd=i;

//        System.out.println(gcd);

        // alternate solution for gcd
        System.out.println( gcd_by_recursion(x,y) );
    }
}

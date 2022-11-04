package DATA_STRUCTURE.imp_codes;

public class lcm {
    public static void main(String[] args) {
        int m =4 , n = 14;
        int gcd =1;

        for (int i = 1; i <=m && i<=n; i++) {

            if(m%i==0 && n%i==0)
            {
                gcd=i;
            }
        }

        int lcm = (m*n)/gcd;
        System.out.println("lcm of "+m+" and "+n+" is "+lcm);



    }
}


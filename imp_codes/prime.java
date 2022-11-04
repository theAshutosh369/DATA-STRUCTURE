package Data_structure.imp_codes;

public class prime {
    public static void main(String[] args) {
        int n=30;

        int m=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0) m++;
        }
        if(m==0) System.out.println("prime");
        else System.out.println("not prime");
    }
}

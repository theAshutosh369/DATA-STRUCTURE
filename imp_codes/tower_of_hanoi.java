package Data_structure.imp_codes;

public class tower_of_hanoi {

    static void toh(int n ,char f, char t , char a)
    {
        if(n==1)
        {
            System.out.println("move 1 from rod "+ f + " to "+ t );
            return;
        }
        toh(n-1,f,a,t);
        System.out.println("move "+n+" from rod "+ f + " to "+ t );
        toh(n-1,a,t,f);
    }

    public static void main(String[] args) {
        tower_of_hanoi t = new tower_of_hanoi();
        int n= 5; // no of plates

        t.toh(n,'a','c','b');
    }
}

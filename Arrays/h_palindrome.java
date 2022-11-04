package Data_structure.Arrays;

public class h_palindrome {
    void print(char[] ch)
    {
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+"");
        }
        System.out.println();
    }

    boolean is_palindrome(String word)
    {
        char[] ch = word.toCharArray(); // to store word in array characters
        int start=0;
        int end=word.length()-1;

        //checking its stored or not
        System.out.print("the word is stored in array : ");
        print(ch);
        System.out.println("3rd character is : "+ch[2] );

        // condition
        while(start<end)
        {
            if(ch[start]!=ch[end])
            {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        h_palindrome h = new h_palindrome();

        if(h.is_palindrome("that"))
        {
            System.out.println("its palindrome ");
        }
        else{
            System.out.println("its not palindrome ");
        }
    }
}

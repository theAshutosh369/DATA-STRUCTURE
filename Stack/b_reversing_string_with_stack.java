// reversing a string with a stack

package Data_structure.Stack;
import java.util.Stack;
public class b_reversing_string_with_stack {

    static String reverse_string(String s ) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();

        for(char c : ch)
        {
            stack.push(c);
        }
        for(int i=0;i<s.length();i++)
        {
            ch[i]= stack.pop();
        }
        return new String(ch);

    }
    public static void main(String[] args) {
        String str = " Ashutosh ";
        System.out.println(reverse_string(str));
    }

}

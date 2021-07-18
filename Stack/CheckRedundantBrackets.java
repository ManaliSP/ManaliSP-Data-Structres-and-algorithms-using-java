import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
        Stack<Character> stack = new Stack();
        for(int i=0;i<expression.length();i++)
        {
            char ch = expression.charAt(i);
            if (ch != ')')
            {
                stack.push(ch);
            }
			else
            {
                int count = 0;
                while(!stack.isEmpty())
                {
                    char popped = stack.pop();
                    if (popped == '(')
                    {
                        if (count <= 1)
                        {
                            return true;
                        }
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
                
            }			            
            
        }
        return false;
	}
}
class CheckRedundantBrackets {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

    	String expression = br.readLine().trim();
    	System.out.println(Solution.checkRedundantBrackets(expression));
    }
}

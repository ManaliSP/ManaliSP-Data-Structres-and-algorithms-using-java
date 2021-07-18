import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
        int len = input.length(); 
      
        // length of expression must be even to make 
        // it balanced by using reversals. 
        if (len%2 != 0) 
        return -1; 
      
        // After this loop, stack contains unbalanced 
        // part of expression, i.e., expression of the 
        // form "}}..}{{..{" 
        Stack<Character> s=new Stack<>(); 
          
        for (int i=0; i<len; i++) 
        { 
            char c = input.charAt(i); 
            if (c =='}' && !s.empty()) 
            { 
                if (s.peek()=='{') 
                    s.pop(); 
                else
                    s.push(c); 
            } 
            else
                s.push(c); 
        } 
      
        // Length of the reduced expression 
        // red_len = (m+n) 
        int red_len = s.size(); 
      
        // count opening brackets at the end of 
        // stack 
        int n = 0; 
        while (!s.empty() && s.peek() == '{') 
        { 
            s.pop(); 
            n++; 
        } 
      
        // return ceil(m/2) + ceil(n/2) which is 
        // actually equal to (m+n)/2 + n%2 when 
        // m+n is even. 
        return (red_len/2 + n%2); 
        
	}

}
class MinimumBracketReversal
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        System.out.println(Solution.countBracketReversals(br.readLine().trim()));
    }
}
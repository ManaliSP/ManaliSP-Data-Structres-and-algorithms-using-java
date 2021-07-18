import java.util.*;
class BalancedParenthesis
{
    static boolean isBalanced(String expression)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< expression.length();i++)
        {
            char x = expression.charAt(i);
            if(x == '[' || x == '(' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
            {
                return false;
            }
            char check;
            switch (x) 
            {
                case ')': check = stack.pop();
                        if(check == '}' || check == ']')
                        {
                            return false;
                        }
                    break;
                case '}': check = stack.pop();
                        if(check == ')' || check == ']')
                        {
                            return false;
                        }
                        break;
                case ']': check = stack.pop();
                        if(check == ')' || check == '}')
                        {
                            return false;
                        }
                        break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        System.out.println(isBalanced(expression));

    }
}
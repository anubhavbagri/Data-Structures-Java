// Java program for checking balanced brackets
// Helpful when there are too long expressions and there's confusion created in brackets

import java.util.*;

public class BalancedBrackets {
    static boolean isBalanced(String expr) {
        // Using Java Stack class
        Stack<Character> stack = new Stack<Character>();    //LIFO - Last In First Out

        // Scanning the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i); // extracting characters and putting in x

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;   // skips the rest part of our for loop
            }

            // if expression starts from a closing bracket, then stack never gets filled. So, stack remains empty and we return false;
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;

    }

    // Main code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // single integer (no. of strings)
        int n = sc.nextInt();
        sc.nextLine();  // to clear buffer
        String[] bracketExpr = new String[n];
        for (int i = 0; i < n; i++) {
            bracketExpr[i] = sc.nextLine();
        }

        //printing output
        for (int i = 0; i < bracketExpr.length; i++) {
            if (bracketExpr[i].isEmpty())
                System.out.println("NO");
            else if (isBalanced(bracketExpr[i]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
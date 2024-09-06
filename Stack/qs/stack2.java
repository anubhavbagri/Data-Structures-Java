package qs;

import java.util.*;

// https://www.youtube.com/watch?v=uuE2pEjLiEI

public class stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (!val) {
                    System.out.print(false);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (!val) {
                    System.out.print(false);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (!val) {
                    System.out.print(false);
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char ch) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != ch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}

package qs;

import java.util.*;
// https://www.youtube.com/watch?v=aMPXhEdpXFA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=106
public class stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                if(st.peek() == '('){
                    System.out.print(true);
                    return;
                } else {
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.print(false);
    }
}

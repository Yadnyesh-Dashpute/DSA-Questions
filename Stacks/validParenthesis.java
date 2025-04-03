import java.util.Stack;

class validParenthesis {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s1.push(ch);
            } else {
                // Check if stack is empty before accessing peek
                if (s1.isEmpty()) {
                    return false;
                }

                char top = s1.peek();
                if ((top == '(' && ch == ')') || 
                    (top == '[' && ch == ']') || 
                    (top == '{' && ch == '}')) {
                    s1.pop();
                } else {
                    return false;
                }
            }
        }

        // Stack should be empty if the string is valid
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        validParenthesis sol = new validParenthesis();
        System.out.println(sol.isValid("()"));      // true
        System.out.println(sol.isValid("()[]{}"));  // true
        System.out.println(sol.isValid("(]"));      // false
        System.out.println(sol.isValid("([)]"));    // false
        System.out.println(sol.isValid("{[]}"));    // true
    }
}

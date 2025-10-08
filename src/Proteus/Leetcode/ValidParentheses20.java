package Proteus.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
        System.out.println(isValid("()"));      // true
    }

    public static boolean isValid(String s) {
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put('}', '{');
        parentheses.put(']', '[');
        // [,{,( ],},]
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (parentheses.containsKey(c)) {
                // Pop if possible, otherwise use a placeholder
                char topElement = stack.isEmpty() ? '@' : stack.pop();

                if (topElement != parentheses.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

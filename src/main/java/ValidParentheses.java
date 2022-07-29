import java.util.Stack;
/*
https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java
Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.
        Examples

        "()"              =>  true
        ")(()))"          =>  false
        "("               =>  false
        "(())((()())())"  =>  true

        Constraints

        0 <= input.length <= 100

        Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters. Furthermore, the input string may be empty and/or not contain any parentheses at all. Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
*/


public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        Stack<Character> stack = new Stack<>();
        String parenthesesString = parens.codePoints()
                .filter(ch -> (ch == '(' || ch == ')'))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        for (Character character : parenthesesString.toCharArray()) {
            if (character == '(') {
                stack.add(character);
            } else if (stack.isEmpty() || stack.pop() == character) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

import Exceptions.InvalidExpression;

import java.util.Stack;

public class ExpressionParser {


    public static String parseExpressionInReversePolandNotation(String expression) {

        StringBuilder parsedString = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            int priority = getPriority(symbol);
            if (priority == 0) {
                parsedString.append(symbol);
            }
            if (priority == 1) {
                stack.push(symbol);
            }
            if (priority > 1) {
                parsedString.append(" ");
                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority) {
                        parsedString.append(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(symbol);
                parsedString.append(" ");
            }
            if (priority == -1) {
                parsedString.append(" ");
                while (getPriority(stack.peek()) != 1) {
                    parsedString.append(stack.pop());
                }
                stack.pop();
            }

        }
        while (!stack.empty()) {
            parsedString.append(" ");
            parsedString.append(stack.pop());
        }
        return parsedString.toString();
    }

    private static int getPriority(char ch) {

        if (ch == '*' || ch == '/') {
            return 3;
        } else if (ch == '+' || ch == '-') {
            return 2;
        } else if (ch == '(') {
            return 1;
        } else if (ch == ')') {
            return -1;
        } else {
            return 0;
        }
    }
}
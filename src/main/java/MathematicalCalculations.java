import Exceptions.DivisionByZero;

import java.util.ArrayList;
import java.util.Stack;

public class MathematicalCalculations {
    public static double Calculations(ArrayList<String> expression) throws DivisionByZero {
        ArrayList<String> numbersOrArithmeticsOperations = new ArrayList<>(expression);
        Stack<Double> stackForCalculating = new Stack<>();
        for (String numbersOrArithmeticsOperation : numbersOrArithmeticsOperations)
            if (Validator.isNumber(numbersOrArithmeticsOperation)) {
                stackForCalculating.push(Double.parseDouble(numbersOrArithmeticsOperation));
            } else {
                double firstOperand = stackForCalculating.pop();
                double secondOperand = stackForCalculating.pop();
                switch (numbersOrArithmeticsOperation) {
                    case "+":
                        stackForCalculating.push(firstOperand + secondOperand);
                        break;
                    case "-":
                        stackForCalculating.push(secondOperand - firstOperand);
                        break;
                    case "*":
                        stackForCalculating.push(firstOperand * secondOperand);
                        break;
                    case "/":
                        stackForCalculating.push(secondOperand / firstOperand);
                        break;
                }
            }
        double answer = stackForCalculating.pop();
        if (answer == Double.POSITIVE_INFINITY) {
            throw new DivisionByZero("Делить на ноль нельзя!!!");
        }
        return answer;
    }
}

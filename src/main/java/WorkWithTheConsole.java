import Exceptions.InvalidExpression;

import java.util.Scanner;

public class WorkWithTheConsole {
    public static void messageForUsers() {
        System.out.println("Приветствую! Это калькулятор, который может высчитывать несколько действий сразу!" +
                " Введи какое нибудь выражение и нажми \"Enter\" ");
    }

    public static String getExpression() {
        return new Scanner(System.in).nextLine();
    }

    public static void outputToTheConsoleOfTheResponse() {
        System.out.println("Ответ: " + MathematicalCalculations.Calculations());
    }
}

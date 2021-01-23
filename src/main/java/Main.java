import Exceptions.DivisionByZero;
import Exceptions.InvalidExpression;

import java.util.EmptyStackException;


public class Main {
    public static void main(String[] args) throws InvalidExpression, DivisionByZero {

        WorkWithTheConsole.messageForUsers();

        try {
            WorkWithTheConsole.outputToTheConsoleOfTheResponse();
        } catch (EmptyStackException e) {
            throw new InvalidExpression("Некорректное выражение! В выражении не должно быть букв! И оно не должно быть пустым.");
        }

    }

}

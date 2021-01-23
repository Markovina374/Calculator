import Exceptions.DivisionByZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalCalculationsTest {
    @Test
    void testCalculations() throws DivisionByZero {
        String expression = "3*(3+4)";
        assertEquals(21, MathematicalCalculations.Calculations(ExpressionParser.parseExpressionInReversePolandNotation(expression)));
    }
}
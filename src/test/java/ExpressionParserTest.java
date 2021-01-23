
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionParserTest {
    @Test
    void testParseExpressionInReversePolandNotation() {
        String expression = "3*(4+6)";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("6");
        arrayList.add("+");
        arrayList.add("*");
        assertEquals(arrayList, ExpressionParser.parseExpressionInReversePolandNotation(expression));
    }
}
package mvc.utils;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorUtilTest {

    @Test
    void calculateExpression() throws EvaluationException, ParseException {
        Assertions.assertEquals(11.6d, CalculatorUtil.calculateExpression("20-4.2*2"));
        Assertions.assertEquals(26.0d, CalculatorUtil.calculateExpression("41-(8+7)"));
        Assertions.assertEquals(3.3d, CalculatorUtil.calculateExpression("14.2/7.1+1.3"));
    }
}
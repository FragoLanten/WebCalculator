package mvc.utils;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;
import com.ezylang.evalex.parser.ParseException;

public class CalculatorUtil {
    public static double calculateExpression(String mathExpression) throws EvaluationException, ParseException {
        Expression expression = new Expression(mathExpression);
        EvaluationValue result = expression.evaluate();
        return result.getNumberValue().doubleValue();
    }
}

package mvc;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;
import com.ezylang.evalex.parser.ParseException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
    public class Controller {

    @RequestMapping("/")
    public String showMainView(HttpServletRequest request, Model model) throws EvaluationException, ParseException {
        String mathExpression = request.getParameter("expression");
        Expression expression = new Expression(mathExpression);
        EvaluationValue result = expression.evaluate();
        model.addAttribute("nameAttribute", result);
        return "mainView";
    }
}

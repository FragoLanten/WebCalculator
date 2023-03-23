package mvc.controllers;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;
import com.ezylang.evalex.parser.ParseException;
import mvc.utils.CalculatorUtil;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String showMainView() {
        return "request-view";
    }

    @RequestMapping("/showResult")
    public String showResultView(HttpServletRequest request, Model model) throws EvaluationException, ParseException {
        String mathExpression = request.getParameter("expression");
        Double resultDouble = CalculatorUtil.calculateExpression(mathExpression);
        model.addAttribute("resultValue", resultDouble);
        model.addAttribute("requestExpression", mathExpression);
        return "result-view";
    }
}

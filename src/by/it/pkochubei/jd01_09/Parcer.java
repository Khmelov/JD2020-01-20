package by.it.pkochubei.jd01_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expression) {
        expression = expression.trim().replace(" ", "");
        String[] part=expression.split(Patterns.OPERATION,2);
        if (part.length==1)
            return Var.create(expression);
        Var left = Var.create(part[0]);
        Var right = Var.create(part[1]);
        Pattern compile=Pattern.compile(Patterns.OPERATION);
        Matcher matcher = compile.matcher(expression);
        if (matcher.find()){
            String operation=matcher.group();
            switch (operation){
                case "+":
                    assert left != null;
                    return left.add(right);
                case "-":
                    assert left != null;
                    return left.sub(right);
                case "*":
                    assert left != null;
                    return left.mul(right);
                case "/":
                    assert left != null;
                    return left.div(right);
            }
        }
        return null;
    }
}
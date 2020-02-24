package by.it.zhuravaskarabahataya.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {

    Var calc(String expression) throws CalcException{
        expression = expression.trim().replace(" ", "");
        String[] parts = expression.split(Patterns.OPERATION, 2);
        if (parts.length == 1){
            return Var.create(expression);
        }
        Var right = Var.create(parts[1]);
        if (expression.contains("=")){
            return Var.saveVar(parts[0], right);
        }
        Var left = Var.create(parts[0]);
        Pattern p = Pattern.compile(Patterns.OPERATION);
        Matcher m = p.matcher(expression);
        if (m.find()){
            String operation = m.group();
            switch (operation){
                case "+": {return left.add(right);
                }
                case "-": return left.sub(right);
                case "*": return left.mul(right);
                case "/": return left.div(right);
            }
        }
        return null;
    }

}

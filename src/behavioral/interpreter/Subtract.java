package behavioral.interpreter;

import java.util.Map;

// Concrete expression for subtraction
public class Subtract implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Subtract(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return leftExpression.interpret(variables) - rightExpression.interpret(variables);
    }
}

package behavioral.interpreter;

import java.util.Map;

// Concrete expression for addition
public class Add implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Add(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return leftExpression.interpret(variables) + rightExpression.interpret(variables);
    }
}
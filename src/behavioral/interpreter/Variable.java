package behavioral.interpreter;

import java.util.Map;

// Concrete expression for variables
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return variables.getOrDefault(name, 0);
    }
}

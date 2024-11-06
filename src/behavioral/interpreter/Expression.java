package behavioral.interpreter;

import java.util.Map;

// Expression interface
public interface Expression {
    int interpret(Map<String, Integer> variables);
}

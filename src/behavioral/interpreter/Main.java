package behavioral.interpreter;

import java.util.Map;

/*
Defines a representation for a language's grammar along with an interpreter that uses this representation to interpret sentences in the language.
It’s commonly used in implementing expressions, grammars, and languages.
*/

// Usage
public class Main {
    public static void main(String[] args) {
        // Building the expression "a - (b + c)"
        Expression expression = new Subtract(new Variable("a"), new Add(new Variable("b"), new Variable("c")));

        Map<String, Integer> variables = Map.of("a", 10, "b", 3, "c", 5);
        System.out.println("Result: " + expression.interpret(variables)); // Result: 2
    }
}

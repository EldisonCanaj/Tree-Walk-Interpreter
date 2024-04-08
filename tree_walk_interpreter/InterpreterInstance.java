package tree_walk_interpreter;

import java.util.HashMap;
import java.util.Map;

/*
 * For instances
 */
class InterpreterInstance {
    private InterpreterClass klass;
    private final Map<String, Object> fields = new HashMap<>();

    InterpreterInstance(InterpreterClass klass) {
        this.klass = klass;
    }

    Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        InterpreterFunction method = klass.findMethod(name.lexeme);
        if (method != null) return method.bind(this);

        throw new RuntimeError(name, "Underfined property '" + name.lexeme + "'.");
    }

    void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }

    @Override
    public String toString() {
        return klass.name + " instance";
    }
}

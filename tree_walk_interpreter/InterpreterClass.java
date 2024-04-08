package tree_walk_interpreter;

import java.util.List;
import java.util.Map;

/*
 * For classes
 */
class InterpreterClass implements InterpreterCallable {
    final String name;
    final InterpreterClass superclass;
    private final Map<String, InterpreterFunction> methods;

    InterpreterClass(String name, InterpreterClass superclass, Map<String, InterpreterFunction> methods) {
        this.name = name;
        this.superclass = superclass;
        this.methods = methods;
    }

    InterpreterFunction findMethod(String name) {
        if (methods.containsKey(name)) {
            return methods.get(name);
        }

        if (superclass != null) {
            return superclass.findMethod(name);
        }

        return null;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        InterpreterInstance instance = new InterpreterInstance(this);
        InterpreterFunction initializer = findMethod("init");
        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }

        return instance;
    }

    @Override
    public int arity() {
        InterpreterFunction initializer = findMethod("init");
        if (initializer == null) return 0;
        return initializer.arity();
    }
}

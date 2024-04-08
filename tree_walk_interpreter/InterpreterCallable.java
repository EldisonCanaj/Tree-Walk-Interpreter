package tree_walk_interpreter;

import java.util.List;

interface InterpreterCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments); 
}

# Tree-Walk-Interpreter

To compile the interpreter type in terminal:
javac tree_walk_interpreter/Main.java

To run the program type in terminal:
java tree_walk_interpreter/Main

to run a prompt in terminal or type in terminal:
java tree_walk_interpreter/Main filepath

with the path of the file to run with file.

To assign variables must use var keyword:
var a = 1; / var helloWorld = "Hello World!";

To write functions, must use function keyword:
fun functionName() {} / fun functionName(arguments) {}

The interpreter can support binary operations such as equality:
"==" equal / "!=" not equal
comparison:
">" greater than / ">=" greater than or equal to / "<" less than / "<=" less than or equal to
arithmetic:
"+" addition / "-" subtraction / "\*" multiplication / "/" division / "%" modulus

The interpreter also supports other operations such as logical operations:
true "and" true / true "or" false

Loops:
"while" (condition) {} / for(var a = 0; a < 5; a = a + 1){}

Class:
class className{}

Super Class:
class className < superClass {}

Example of program :
class Hello {
helloWorld() {
print "Hello World";
}
}

var hello = Hello();
for (var i = 0; i < 5; i = i + 1) {
hello.helloWorld();
}

output:
Hello World
Hello World
Hello World
Hello World
Hello World

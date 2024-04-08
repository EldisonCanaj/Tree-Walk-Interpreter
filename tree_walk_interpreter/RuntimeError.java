package tree_walk_interpreter;
/*
 * For runtime errors
 */
class RuntimeError extends RuntimeException {
    final Token token;

   RuntimeError(Token token, String message) {
    super(message);
    this.token = token;
   }
}

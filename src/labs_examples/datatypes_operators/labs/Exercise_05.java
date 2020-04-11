package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        if (a || b) {
            System.out.println("Once again, a or b is true");
        }
        if (a & b) {
            System.out.println("a is true and b is false");
        }
        if (a && b) {
            System.out.println("Once again, a is true and b is false.");
        }
        if (a ^ b) {
            System.out.println("Only one of the above conditions is true");
        }
        if (!a) {
            System.out.println("a is false");
        }

    }

}


package java8;

/*
    In Java, Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface).
    Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value
 */

@FunctionalInterface
interface Functions{
    int operations(int a,int b);
//    abstract void test();  // If Use @FunctionalInterface than compilar will not allow to add more than one normal or abstract method inside one interface.
    default int operations(int a,int b,int c){
        return 1;
    }

}
public class LambdaExpression {
    public static void main(String[] args) {
        // By using of lambda expression
        Functions addFunction=(x,y)-> x+y; // Integer::sum
        Functions multipicationFunc= (x,y)->x*y;

        System.out.println(addFunction.operations(10,20));
        System.out.println(multipicationFunc.operations(10,20));

    }
}

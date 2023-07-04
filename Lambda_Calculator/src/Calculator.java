import java.util.function.Supplier;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Calculator {
    static Supplier<Calculator> calc_instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> {Integer z = 0;
        try {
            z = x / y;
        } catch(ArithmeticException error) {
            System.out.println("Что ты делаешь, говорили же не делить на ноль!");
        }
            return z;

    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}


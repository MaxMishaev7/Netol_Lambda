public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Calculator!");
        Calculator calc = Calculator.calc_instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
    }
    // Ошибка заключается в делении на 0 при вызове функции calc.divide.apply(a,b);
    // Одно из возможных решений избежать появления ошибки -
    // добавить в функцию операторы обработки исключений try-catch.
    // Есть ещё один вариант: с помощью условного оператора проверить, y == 0?

}

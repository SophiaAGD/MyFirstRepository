package HomeWork_3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args){
        CalculatorWithMathExtend calc = new CalculatorWithMathExtend();
        System.out.println(calc.sum(calc.sum(4.1, calc.multiply(15, 7)), calc.exponentiation(calc.divide(28, 5), 2)));
    }
}

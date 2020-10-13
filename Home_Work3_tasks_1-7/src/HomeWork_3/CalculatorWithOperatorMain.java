package HomeWork_3;

public class CalculatorWithOperatorMain { // Task 2 (с использованием операторов)
    public static void main(String[] args){
        CalculatorWithOperator calc = new CalculatorWithOperator();
        System.out.println(calc.sum(calc.sum(4.1, calc.multiply(15, 7)), calc.exponentiation(calc.divide(28, 5), 2)));


    }
}

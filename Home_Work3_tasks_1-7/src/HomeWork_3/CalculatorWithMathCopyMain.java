package HomeWork_3;

public class CalculatorWithMathCopyMain { // Task3
    public static void main(String[] args){
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy(); // создаем объект класса
        System.out.println(calc.sum(calc.sum(4.1, calc.multiply(15, 7)), calc.exponentiation(calc.divide(28, 5), 2))); //считаем пример


    }
}

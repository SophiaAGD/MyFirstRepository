package HomeWork_3;

public class CalculatorWithCounterInterfaceMain { // Task 6
    public static void main(String[] args){
        CalculatorWithMathExtend a = new CalculatorWithMathExtend(); //создаем объект класса
        CalculatorWithMathCopy b = new CalculatorWithMathCopy(); //создаем объект класса
        CalculatorWithOperator c = new CalculatorWithOperator(); //создаем объект класса
        CalculatorWithCounter calc = new CalculatorWithCounter(b); // создаем объект класса, передавая в конструктор один из объектов
        System.out.println(calc.sum(calc.sum(4.1, calc.multiply(15, 7)), calc.exponentiation(calc.divide(28, 5), 2))); // считаем пример
        System.out.println(calc.getCountoperation()); // выводим количество использований данного калькулятора
    }
}

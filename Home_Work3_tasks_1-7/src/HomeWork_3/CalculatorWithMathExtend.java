package HomeWork_3;

public class CalculatorWithMathExtend extends CalculatorWithOperator implements ICalculator { // Task 4 ( наследование класса CalculatorWithOperator и реализация интерфейса ICalculator)
    public double exponentiation(double a, int b){
        return Math.pow(a, b); // возведение в степень b целого типа
    }
    public double module(double a){
        return Math.abs(a);

    }
    public double koren(double a){
        return Math.sqrt(a);
    }
}


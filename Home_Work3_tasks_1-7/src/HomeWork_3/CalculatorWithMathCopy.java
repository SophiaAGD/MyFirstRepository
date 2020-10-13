package HomeWork_3;

class CalculatorWithMathCopy implements ICalculator{ // Task3 (класс, реализующий интерфейс ICalculator и использующий математические методы)
    public double sum(double a, double b){
        return a+b;

    }
    public double difference(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b)
    {
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
    public double exponentiation(double a, int b){
        return Math.pow(a, b);
    }
    public double module(double a){
        return Math.abs(a);

    }
    public double koren(double a){
        return Math.sqrt(a);
    }


}

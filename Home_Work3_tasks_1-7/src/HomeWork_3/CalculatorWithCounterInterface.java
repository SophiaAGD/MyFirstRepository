package HomeWork_3;

class CalculatorWithCounterInterface implements ICalculator { //Task 6
    long countoperation; // объявляем счетчик вызовов калькулятора
    ICalculator mathclass; // класс передаваемого калькулятора
    public CalculatorWithCounterInterface(ICalculator mathclass){ // конструктор

        this.mathclass = mathclass; // инициализация передаваемого калькулятора
    }


    public long getCountoperation() { // возвращение счетчика вызовов

        return countoperation;
    }



    public double sum(double a, double b) {
        countoperation++;
        return mathclass.sum(a, b);
    }

    public double difference(double a, double b) {
        countoperation++;
        return mathclass.difference(a, b);
    }

    public double multiply(double a, double b) {
        countoperation++;
        return mathclass.multiply(a, b);
    }

    public double divide(double a, double b) {
        countoperation++;
        return mathclass.divide(a, b);
    }

    public double exponentiation(double a, int b) {
        countoperation++;
        return exponentiation(a, b);
    }

    public double module(double a) {
        countoperation++;
        return module(a);
    }

    public double koren(double a) {
        countoperation++;
        return mathclass.koren(a);
    }
}

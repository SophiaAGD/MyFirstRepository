package HomeWork_3;

class CalculatorWithMemory { //Task
    double memory; // переменная памяти
    CalculatorWithOperator mathclass; // передаваемый калькулятор
    public CalculatorWithMemory(CalculatorWithOperator mathclass){ // конструктор

        this.mathclass = mathclass;
    }
    double getMemory(){ // возвращение и стирание памяти
        double memory = this.memory;
        this.memory = 0;
        return memory;
    }
    void setMemory(double memory){ //перезаписывание памяти

        this.memory = memory;
    }




    public double sum(double a, double b) {

        return mathclass.sum(a, b);
    }

    public double difference(double a, double b) {

        return mathclass.difference(a, b);
    }

    public double multiply(double a, double b) {

        return mathclass.multiply(a, b);
    }

    public double divide(double a, double b) {

        return mathclass.divide(a, b);
    }

    public double exponentiation(double a, int b) {

        return mathclass.exponentiation(a, b);
    }

    public double module(double a) {

        return mathclass.module(a);
    }

    public double koren(double a) {

        return mathclass.koren(a);
    }

}

package HomeWork_3;

class CalculatorWithCounter { //Task 5 (калькулятор со счетчиком)
    long countoperation; //переменная-счетчик
    CalculatorWithOperator mathclass1;
    CalculatorWithMathCopy mathclass2;
    CalculatorWithMathExtend mathclass3;

    public long getCountoperation() { //возврат количества вызовов калькулятора

        return countoperation;
    }


    public CalculatorWithCounter(CalculatorWithOperator mathclass) {
        mathclass1 = mathclass;
        countoperation = 0;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy mathclass) {
        mathclass2 = mathclass;
        countoperation = 0;
    }

    public CalculatorWithCounter(CalculatorWithMathExtend mathclass) {
        mathclass3 = mathclass;
        countoperation = 0;
    }

    //методы (вычисления):

    public double sum(double a, double b) {
        countoperation++;
        if (mathclass1 != null) {
            return mathclass1.sum(a, b);
        }
        if (mathclass2 != null) {
            return mathclass2.sum(a, b);
        }
        if (mathclass3 != null) {
            return mathclass3.sum(a, b);
        }
        return 0;
    }

    public double difference(double a, double b) {
        countoperation++;
        if (mathclass1 != null) {
            return mathclass1.difference(a, b);
        }
        if (mathclass2 != null) {
            return mathclass2.difference(a, b);
        }
        if (mathclass3 != null) {
            return mathclass3.difference(a, b);
        }
        return 0;
    }

    public double multiply(double a, double b) {
        countoperation++;
        if (mathclass1 != null) {
            return mathclass1.multiply(a, b);
        }
        if (mathclass2 != null) {
            return mathclass2.multiply(a, b);
        }
        if (mathclass3 != null) {
            return mathclass3.multiply(a, b);
        }
        return 0;
    }

    public double divide(double a, double b) {
        countoperation++;
        if (mathclass1 != null) {
            return mathclass1.divide(a, b);
        }
        if (mathclass2 != null) {
            return mathclass2.divide(a, b);
        }
        if (mathclass3 != null) {
            return mathclass3.divide(a, b);
        }
        return 0;
    }

    public double exponentiation(double a, int b) {
        countoperation++;
        if (mathclass1 != null) {
            return mathclass1.exponentiation(a, b);
        }
        if (mathclass2 != null) {
            return mathclass2.exponentiation(a, b);
        }
        if (mathclass3 != null) {
            return mathclass3.exponentiation(a, b);
        }
        return 0;
    }

    public double module(double a) {
        countoperation++;
        if (mathclass1 != null) {
            return mathclass1.module(a);
        }
        if (mathclass2 != null) {
            return mathclass2.module(a);
        }
        if (mathclass3 != null) {
            return mathclass3.module(a);
        }
        return 0;
    }

    public double koren(double a) {
        countoperation++;
        if (mathclass1 != null) {
            return mathclass1.koren(a);
        }
        if (mathclass2 != null) {
            return mathclass2.koren(a);
        }
        if (mathclass3 != null) {
            return mathclass3.koren(a);
        }
        return 0;
    }
}
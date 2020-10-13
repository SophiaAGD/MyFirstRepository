package HomeWork_3;

public class CalculatorWithOperator  implements ICalculator{ // Task 2
    public double sum(double a, double b){
        return a+b;

    }
    public double difference(double a, double b){

        return a-b;
    }
    public double multiply(double a, double b){

        return a*b;
    }
    public double divide(double a, double b){

        return a/b;
    }
    public double exponentiation(double a, int b){
        double answer = a;
        for(int i = 0; i < b-1; i++){
            answer = answer * a;

        }
        return answer;
    }
    public double module(double a){
        if(a>0){
            return a;
        }
        else{
            return -a;
        }

    }
    public double koren(double a){

        return Math.sqrt(a);
    }

}

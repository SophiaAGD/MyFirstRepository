package HomeWork_3;

public class CalculatorWithMemoryMain { //Task 7
    public static void main(String[] args){
        CalculatorWithOperator a = new CalculatorWithOperator();
        CalculatorWithMemory mem = new CalculatorWithMemory(a);
        mem.setMemory(mem.divide(28.0, 5)); // записываем в память значение вычисления
        mem.setMemory(mem.exponentiation(mem.getMemory(),2));
        mem.setMemory(mem.sum(mem.multiply(15,7), mem.getMemory()));
        mem.setMemory(mem.sum(4.1, mem.getMemory()));
        System.out.println(mem.getMemory());

    }
}

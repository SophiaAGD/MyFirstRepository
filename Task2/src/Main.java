public class Main {
    public static void main(String[] args) {

        int a = 5; //
        int b = 2;//
        int c = 8;//
        double d = a + b / c;
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        priority();// вызываем метод priority для последущего вывода описанного в методе на консоль
        priority1();
        priority2();
        priority3();
    }

    public static void priority() {//создаем новый метод  внутри класса Main
        int a = 5;//объявляем переменные
        int b = 2;
        int c = 8;
        double d = (a + b) / c; //записываем выражение в переменную d типа double, чтобы выводить число вещественного типа на консоль
        System.out.println(d);//выводим выражение и три значения для определения приоритетности каждого оператора
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }//после вывода на консоль полученного ответа и первоначальных значений переменных, сделаем вывод, что первым идет сложение аргументов в скобках, затем деление

    public static void priority1() {//создаем практически идентичный метод  внутри класса Main
        int a = 5; // объявляем переменные типа int
        int b = 2;
        int c = 8;
        double d = (a + b++) / c;//вновь записываем выражение в переменную d типа double, чтобы выводить число вещественного типа на консоль
        System.out.println(d);//выводим выражение и три значения для определения приоритетности каждого оператора
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }//после вывода на консоль полученного ответа и первоначальных значений переменных, сделаем вывод, что постинкремент - третья операция после сложения(1) и деления(2)

    public static void priority2() {//
        int a = 5;// объявляем переменные типа int
        int b = 2;
        double c = 8;
        double d = (a + b++) / c--;
        System.out.println(d);//вывод выражения
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    } //после вывода на консоль полученного ответа и первоначальных значений переменных, сделаем вывод:
    // 1) сложение в скобках 2)деление 3)постдекремент для b и с


    public static void priority3() {
        int a = 5; // объявляем переменные типа int
        int b = 2;
        double c = 8;
        double d = (a * b >> b++) / --c;
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    } // 1) умножение 2) сдвиг 3) предекремент 4) постинкремент

}


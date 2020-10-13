import java.util.Scanner; // импортируем сканер

public class Main { // создаем главный класс, который будет содержать два взаимосвязанных метода

    public static void main(String[] args){ // "главный" метод, в котором напишем основной код программы
        System.out.println("У нас будний день?"); // выводим строку, ожидаем ответ
        Scanner sc = new Scanner(System.in); // создаем новый экземпляр класса  Scanner
        boolean weekday = sc.nextBoolean(); // сканируем введенные значения
        System.out.println("У нас отпуск?"); // выдаем вторую строку для второго условия, запрашиваем ответ вида "true"/"false"
        boolean holiday = sc.nextBoolean(); // аналогично сканируем введенный ответ
        sc.close(); // прекращаем сканирование
        if(sleepIn(weekday, holiday)) { // условие: если метод sleepIn выполняется для каждого параметра, то можем продолжать спать
            System.out.println("Спим");
        }else{ // иначе - идем на работу
            System.out.println("Идем впахивать");
        }
    }

    public  static boolean sleepIn(boolean weekday, boolean holiday) { // создаем логический метод, передаем ему два параметра типа boolean
        if ((weekday == true) && (holiday == false)){ //задаем условие, от результата (не)соблюдения которого будет зависеть выведение текста в консоль (прописано в методе main)
            return false; // возвращаем false, если день будний ( т.е. будний день - правда) и это не день отпуска (отпуск - неправда), возможно, описано слишком простым языком, но это необходимо, чтобы не запутаться
        }else{ // иначе выводим true для каждого случая
            return true;
        }


    }

}


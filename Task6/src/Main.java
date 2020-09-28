import java.util.Scanner;// импортируем сканер

public class Main {//создаем основной класс

    public static void main(String[] args){// создаем главный метод

            Scanner scanning = new Scanner(System.in); //создаем экземпляр класса Scanner, передав ему необходимые параметры
            System.out.println("Введите 10 чисел");//выводим запрос программы пользователю
            int[] newArray = new int[10];//создаем массив из 10 чисел, в который будут записываться введенные значения
            for (int i = 0; i < 10; i++){//создаем цикл для заполнения пустых ячеек массива
                newArray[i] = scanning.nextInt();//пока итерация не достигнет предела, массив будет продолжать заполняться

            }
      createPhoneNumber(newArray);//вызываем метод, выдающий последовательность записанных в массив значений в формате номера телефона
    }
    public static void createPhoneNumber(int[]newArray){//создаем метод для вывода значений в определенном формате
        System.out.println("("+ newArray[0] + newArray[1] + newArray[2] + ") " + newArray[3] + newArray[4] + newArray[5] + " - " + newArray[6] +newArray[7] + newArray[8] +newArray[9]);
        // с помощью конкатенации "склеиваем" записанные в массив числа в формате, описанном в условии задания
    }
}

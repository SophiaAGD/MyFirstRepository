package Homework4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class DataContainer <T extends Comparable> { // Task 1

    T[] data; //массив обобщенного типа (Task 2)



    public int add(T item) { // Task 4
        if (item == null) {//проверяем, чтобы вводимое число не равнялось "null"
            return -1;
        }
        boolean addCheck = true; // переменная, отвечающая за расширение массива
        for (int i = 0; i < data.length; i++){ // проверяем, нужно ли расширять массив
            if(data[i] == null){
                addCheck = false;
                break;
            }
        }
        if (addCheck == true){ // расширяем массив, если это нужно
            data = Arrays.copyOf(data, data.length + 1);

        }
        int i; // переменная, хранящая индекс элемента, который был добавлен
        for (i = 0; i < data.length; i++) { // добавление элемента
            if (data[i] == null) {
                data[i] = item;
                break;
            }
        }
        return i; //возвращение индекса добавленного элемента
    }
    public T get(int index){
        return data[index];
    } //возвращение значения по индексу (Task 5)
    public T[] getItems(){
        return data;
    } // возвращение массива (Task 6)
    public boolean delete(int index){ // удаление элемента по индексу
        if(index > data.length - 1){ // проверяем, существует ли данный индекс
            return false;
        }
        T[] buffArray = Arrays.copyOf(getItems(), data.length); // создаем буферный массив
        data = Arrays.copyOf(data, data.length - 1); // сокращаем массив на 1
        int j = 0;
        for(int i = 0; i < buffArray.length; i++){ // копируем в массив значение из буферного массива в основной массив, за исключением требуемого элемента
            if(i != index){
                data[j] = buffArray[i];
                j++;
            }
        }
        return true;
    } // Task 7
    public boolean delete(T item){ //удаление элемента по его содержимому
        boolean itExists = false; // проверяем, есть ли нужный элемент
        for(int i = 0; i < data.length; i++){
            if(data[i] == item){
                itExists = true;
                break;
            }
        }
        if(itExists == false){ // возвращаем false, элемент не существует
            return  false;
        }
        T[] buffArray = Arrays.copyOf(data, data.length); // создаем буферный массив
        data = Arrays.copyOf(data, data.length - 1); // сокращаем массив на 1
        int j = 0;
        for (int i = 0; i < buffArray.length; i++){ // копируем в массив значение из буферного массива в основной массив, за исключением требуемого элемента
            if(buffArray[i] != item){
                data[j] = buffArray[i];
                j++;
            }
        }
        return true;
    } // Task 8
    public void sort (Comparator <T> comparator){ //сортировка (Task 9)
        int nullCounter = 0; // переменная, хранящая количество элементов массива со значением null
        for(int i = 0; i < data.length; i++){ // считаем количество элементов со значением null
            if(data[i] == null){
                nullCounter++;
            }
        }
        T[] buffArray = Arrays.copyOf(data, data.length - nullCounter); // создаем буферный массив без null
        int k = 0;
        for(int i = 0; i < data.length; i++){ // заполняем буферный массив элементами, которые не равны null
            if(data[i] != null){
                buffArray[k] = data[i];
                k++;
            }
        }

        for(int i = buffArray.length - 1; i > 0; i--){ // сортируем буферный массив методом пузырька
            for(int j = 0; j < i; j++){
                if((comparator.compare(buffArray[j], buffArray[j+1])) > 0){
                    T buf = buffArray[j];
                    buffArray[j] = buffArray[j+1];
                    buffArray[j+1] = buf;
                }
            }
        }
        data = Arrays.copyOf(buffArray, buffArray.length); // копируем рассортированные элементы в основной массив
        data = Arrays.copyOf(data, data.length + nullCounter); // добавляем элементы, которые были равны null в конец
    }

    public String toString(){ //переопределение метода toString
        String answer = "";
        for(int i = 0; i < data.length; i++){
            if(getItems()[i] != null){
                answer = answer + " " + data[i];
            }

        }
        return answer;
    } //Task 10
    public static void staticSort(DataContainer<String > container){ //сортируем элементы в переданном объекте, используя реализацию сравнения хранимого объекта (Task 11)

        Comparator<String> c = Comparator.comparing(String::toString); //реализация метода compare
        container.sort(c);
    }

}
class Main{
    public static void main(String[] args) {

      DataContainer <String> dataContainer = new DataContainer<>();
      dataContainer.data = new String[1];

        boolean exit = false;
        int switchNumber;
        Scanner scan = new Scanner(System.in);
        while(exit == false){
            System.out.println("Выберите пункт: \n 1. Добавить элемент \n 2. Удалить элемент по индексу \n 3. Удалить по содержимому \n 4. Сортировка \n 5. Вывести элемент \n 6. Вывести массив \n 7. Статическая сортировка \n 8. Выход" );
            switchNumber = scan.nextInt();
            Scanner scanForSwitch = new Scanner(System.in);
            String stringItem;
            int intItem;
            switch(switchNumber){
                 case 1: // Task 4
                     System.out.println("Введите данные");
                     stringItem = scanForSwitch.nextLine();
                     dataContainer.add(stringItem);
                     break;
                case 2: // Task 7
                    System.out.println("Введите индекс необходимого элемента");
                    intItem = scanForSwitch.nextInt();
                    dataContainer.delete(intItem);
                    break;
                case 3: // Task 8
                    System.out.println("Введите содержимое необходимого элемента");
                    stringItem = scanForSwitch.nextLine();
                    dataContainer.delete(stringItem);
                    break;
                case 4: // Task 9
                    Comparator<String> c = Comparator.comparing(String::toString);
                    dataContainer.sort(c);
                    System.out.println(dataContainer.toString());

                    break;
                case 5: // Task 5
                    System.out.println("Введите индекс элемента");
                    intItem = scanForSwitch.nextInt();
                    if((intItem <= dataContainer.data.length) && (intItem > 0)) {
                        System.out.println(dataContainer.get(intItem - 1));
                    }else{
                        System.out.println("Нет такого элемента");
                    }
                    break;

                case 6: // Task 6, Task 10
                    System.out.println("Массив: "  + dataContainer.toString());
                    break;
                case 7: //Task 11
                    dataContainer.staticSort(dataContainer); // вызов статического метода
                    break;
                case 8:
                    exit = true;
                    scanForSwitch.close();
                    break;

            }
        }
        scan.close();


    }
}



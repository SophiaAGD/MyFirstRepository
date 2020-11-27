package Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.File;


public class Main {
    public static void main(String[] args) throws IOException {

        boolean exit = false;
        File file = null;
        String filePass = null;


            System.out.println("Создайте файл сохранений, либо нажмите Enter для создания стандартного ");
            Scanner scan = new Scanner(System.in);
            filePass = scan.nextLine();



            if (filePass.equals("")) { // проверяем, введены ли путь и имя файла: если нет, создаем стандартный файл
                if (new File("C://Users//User//Desktop//untitled//Test.txt").exists()){ //  если у нас есть стандартный файл, мы его перезаписываем
                    file = new File("C://Users//User//Desktop//untitled//Test.txt");
                    file.delete();
                }
                filePass = "C://Users//User//Desktop//untitled//Test";
            }
            if (new File(filePass + ".txt").exists()){ // проверяем, существует ли файл: если нет, создаем его
                System.out.println("Файл найден");

            }else {
                file = new File(filePass + ".txt");
                file.createNewFile();

            }





        NBRBLoader nbrbLoader = new NBRBLoader();
        AlfaBankLoader alfaBankLoader = new AlfaBankLoader();
        int choice = 0;
        FileWriter fileWriter = new FileWriter(filePass + ".txt", true);



        while (exit == false) { // "меню"
            System.out.println(" 1: Вывести курсы нацбанка\n 2:Вывести курсы альфабанка\n 3: Записать данные нацбанка в файл\n 4: Записать данные альфабанка в файл\n 5: Вывести данные по конкретной дате и записать в файл \n 6: Выход ");
            Scanner scan2 = new Scanner(System.in);
            choice = scan2.nextInt(); // записываем в переменную choice выбранное пользователем значение
            switch (choice){
                case 1:
                    System.out.println("Нацбанк EUR:" + nbrbLoader.load(SiteLoader.Currency.EUR));
                    System.out.println("Нацбанк RUB:" + nbrbLoader.load(SiteLoader.Currency.RUB));
                    System.out.println("Нацбанк USD:" + nbrbLoader.load(SiteLoader.Currency.USD));
                    break;
                case 2:
                    System.out.println("Альфа-банк EUR:"+ alfaBankLoader.load(SiteLoader.Currency.EUR));
                    System.out.println("Альфа-банк RUB:"+ alfaBankLoader.load(SiteLoader.Currency.RUB));
                    System.out.println("Альфа-банк USD:"+ alfaBankLoader.load(SiteLoader.Currency.USD));
                    break;
                case 3:
                    fileWriter.write("Нацбанк EUR: " + (nbrbLoader.load(SiteLoader.Currency.EUR)) + "\r\n");
                    fileWriter.write("Нацбанк RUB: " + (nbrbLoader.load(SiteLoader.Currency.RUB)) + "\r\n");
                    fileWriter.write("Нацбанк USD: " + (nbrbLoader.load(SiteLoader.Currency.USD)) + "\r\n");
                    break;
                case 4: // вывод данных Альфа-банка
                    fileWriter.write("Альфа-банк EUR: " + (alfaBankLoader.load(SiteLoader.Currency.EUR)) + "\r\n");
                    fileWriter.write("Альфа-банк RUB: " + (alfaBankLoader.load(SiteLoader.Currency.RUB)) + "\r\n");
                    fileWriter.write("Альфа-банк USD: " + (alfaBankLoader.load(SiteLoader.Currency.USD)) + "\r\n");
                    break;
                case 5: // вывод за опрежделенную дату
                    System.out.println("Введите дату через точку");
                    Scanner scan3 = new Scanner(System.in);
                    String date = scan3.nextLine();
                    String[] stringDates = date.split("\\."); //делим введенную дату на три части: день, мясяц, год
                    if (isDateValid(Integer.parseInt(stringDates[2]), Integer.parseInt(stringDates[1]), Integer.parseInt(stringDates[0]))){ //проверяем корректность введенной даты
                        System.out.println("Нацбанк EUR: " + nbrbLoader.load(SiteLoader.Currency.EUR, Integer.parseInt(stringDates[0]), Integer.parseInt(stringDates[1]), Integer.parseInt(stringDates[2])));
                        System.out.println("Нацбанк RUB: " + nbrbLoader.load(SiteLoader.Currency.RUB, Integer.parseInt(stringDates[0]), Integer.parseInt(stringDates[1]), Integer.parseInt(stringDates[2])));
                        System.out.println("Нацбанк USD: " + nbrbLoader.load(SiteLoader.Currency.USD, Integer.parseInt(stringDates[0]), Integer.parseInt(stringDates[1]), Integer.parseInt(stringDates[2])));
                        fileWriter.write("Нацбанк EUR: " + (nbrbLoader.load(SiteLoader.Currency.EUR,  Integer.parseInt(stringDates[0]), Integer.parseInt(stringDates[1]), Integer.parseInt(stringDates[2]))) + " за " + date +"\r\n");
                        fileWriter.write("Нацбанк RUB: " + (nbrbLoader.load(SiteLoader.Currency.RUB,  Integer.parseInt(stringDates[0]), Integer.parseInt(stringDates[1]), Integer.parseInt(stringDates[2]))) + " за " + date + "\r\n");
                        fileWriter.write("Нацбанк USD: " + (nbrbLoader.load(SiteLoader.Currency.USD,  Integer.parseInt(stringDates[0]), Integer.parseInt(stringDates[1]), Integer.parseInt(stringDates[2]))) + " за " + date +"\r\n");
                    }else {
                        System.out.println("Введена некорректная дата");

                    }
                    break;

                 case 6:
                    exit = true;
                    scan2.close();
                    fileWriter.close();
                    break;

            }
        }

    }
    public static boolean isDateValid(int year, int month, int day) { // метод для проверки корректности введенной даты
        boolean dateIsValid = true;
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            dateIsValid = false;
        }
        return dateIsValid;
    }
}


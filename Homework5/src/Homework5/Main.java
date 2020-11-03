package Homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws FileNotFoundException  {
       String separator = File.separator;
       String path = separator + "C:" + separator + "Users" + separator + "User" + separator + "Desktop" + separator + "Война и мир_книга - Copy.txt";

       File file = new File(path);
       String allText = ""; //строка-хранилище для текста


       Scanner scan = new Scanner(file);
       Set uniqueWords =  new HashSet();//создание коллекции HashSet
       Map countWords = new HashMap(); // создание коллекции HashMap
       String[] slayedLine; // переменная, хранящая готовую к обработке информацию, порезанную на слова и избавленную от лишних символов
       while(scan.hasNextLine()) {
               String operatingLine = scan.nextLine().trim(); //сканируем строку и обрезаем лишние пробелы в начале и в конце
               allText = allText + operatingLine; //сохраняем весь текст
               if(operatingLine.isEmpty() == false && operatingLine != " "){ //избавляемся от пустых и хранящих один пробел строк
                   slayedLine = Main.textSlayer(operatingLine);//передаем строку на обработку
                   for(int i = 0; i < slayedLine.length; i++){
                       uniqueWords.add(slayedLine[i]); //добавляем слова в хранящую уникальные слова коллекцию (повторы удаляются автоматически)
                       if(countWords.containsKey(slayedLine[i])){ //считаем количество слов или добавляем новые
                           int buf = (int) countWords.get(slayedLine[i]);
                           buf++;
                            countWords.replace(slayedLine[i], buf);
                       }else{
                           countWords.put(slayedLine[i], 1);
                       }
                   }
               }
           }
       EasySearch easySearch = new EasySearch(); //создаем объект класса EasySearch
       System.out.println("Количество слов война: " + (easySearch.search(allText, "Война") +  easySearch.search(allText, "война")));
       System.out.println("Количество слов мир: " + (easySearch.search(allText, "Мир") + easySearch.search(allText, "мир")));
       System.out.println("Количество слов и: " + (easySearch.search(allText, " и ") + easySearch.search(allText, "И ")));
       System.out.println("Уникальные слова: ");
       System.out.println(uniqueWords);
       System.out.println("Количество слов: ");
        for(int i = 0; i < 10; i++){
            System.out.println(i + 1 + ". " + Collections.max(countWords.entrySet(), Map.Entry.comparingByValue()).getKey() + " " + countWords.get(Collections.max(countWords.entrySet(), Map.Entry.comparingByValue()).getKey())); // считаем и выводим самое повторяющееся слово
            countWords.remove(Collections.max(countWords.entrySet(), Map.Entry.comparingByValue()).getKey()); //удаляем самое повторяющееся слово

            }

        }






    public static String[] textSlayer(String operatingLine){ //метод, удаляющий все лишнее и режущий на слова


            String[] words;
            words = operatingLine.replaceAll("[^А-я]+"," ").replaceAll("[\\s]{2,}", " ").split(" ");
            return words;
    }

}
class EasySearch implements ISearchEngine{ //класс отдельного поиска (task 4.1, task 5)


    @Override
    public long search(String text, String word) {
        long count = 0;
        int i = 0;
        while(text.indexOf(word, i) != -1){ //проверяем, осталось ли нужное слово в урезанной строке
            count++; //счетчик
            i = text.indexOf(word, i); //увеличиваем i, тем самым неявным образом урезая строку
            i = i + word.length();//увеличиваем i, тем самым неявным образом урезая строку

        }
        return count;



    }
}
    interface ISearchEngine { //интерфейс (task 3)
    long search(String text, String word);

}
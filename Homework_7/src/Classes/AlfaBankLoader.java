package Classes;

public class AlfaBankLoader extends SiteLoader{

    @Override
    public double load(Currency currencyName) { // подключаемся к сайту
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    @Override
    protected double handle(String content, Currency currencyName) { // считывание и обработка данных с сайта
        String currencyRateString = content; // данные с сайта
        int index = 0;
        for(int i = 0; i < 4; i++){ // обрезка не интересующих нас курсов
            index = content.indexOf("sellRate", index + 8);
            currencyRateString = content.substring(index);
        }
        index = currencyRateString.indexOf(String.valueOf(currencyName)); // ищем интересующую нас валюту
        currencyRateString = currencyRateString.substring(index - 30); // ищем интересующую нас валюту
        index = currencyRateString.indexOf("sellRate"); //ищем интересующую нас цифру
        currencyRateString = currencyRateString.substring(index + 10, index + 15); // обрезаем лишнее
        double currencyRateDouble = Double.parseDouble(currencyRateString); // приводим к типу double
        return currencyRateDouble;
    }
}

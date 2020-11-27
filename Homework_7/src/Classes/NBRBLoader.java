package Classes;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }
    public double load(SiteLoader.Currency currencyName, int day, int month, int year) { // перегрузка метода load (вывод по дате)
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId() +"?ondate=" + year + "-" + month + "-" + day, currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) { // метод, обрабатывающий данные с сайта
        int index = content.indexOf("Cur_OfficialRate"); // поиск нужной нам строки
        String currencyRateString = content.substring(index + 18, content.length() - 2); // обрезаем лишнее
        double currencyRateDouble = Double.parseDouble(currencyRateString); // приводим к типу double
        return currencyRateDouble;
    }
}

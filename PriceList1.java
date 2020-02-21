package Strings;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Условия задачи
//CrUD для таблицы внутри файла.
//        Считать с консоли имя файла для операций CrUD.
//
//        Программа запускается со следующим набором параметров:
//        -c productName price quantity
//
//        Значения параметров:
//        где id - 8 символов.
//        productName - название товара, 30 символов.
//        price - цена, 8 символов.
//        quantity - количество, 4 символа.
//        -c - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле.
//
//        В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
//        id productName price quantity
//
//        Данные дополнены пробелами до их длины.
//
//        Пример:
//        19846   Шорты пляжные синие           159.00  12
//        198478  Шорты пляжные черные с рисунко173.00  17
//        19847983Куртка для сноубордистов, разм10173.991234
//
//        Требования:
//        •	Программа должна считать имя файла для операций CrUD с консоли.
//        •	В классе Solution не должны быть использованы статические переменные.
//        •	При запуске программы без параметров список товаров должен остаться неизменным.
//        •	При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
//        •	Товар должен иметь следующий id, после максимального, найденного в файле.
//        •	Форматирование новой строки товара должно четко совпадать с указанным в задании.
//        •	Созданные для файлов потоки должны быть закрыты.

public class PriceList1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        if (args.length != 0) {
            if (args[0].equals("-c")) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String fileName = br.readLine();
                FileReader fileReader = new FileReader(fileName);
                br.close();
                BufferedReader reader = new BufferedReader(fileReader);
                ArrayList<String> products = new ArrayList<>();
                ArrayList<Integer> ids = new ArrayList<>();

                // Считываем из файла позиции прайс-листа

                while (reader.ready()) {
                    products.add(reader.readLine());
                }
                reader.close();

                // Ищем максимальный Id

                Pattern p = Pattern.compile("[0-9]+");
                for (String a : products) {
                    Matcher m = p.matcher(a);
                    if (m.find()) ids.add(Integer.parseInt(m.group()));
                }
                int maxId = Collections.max(ids);

                // дописываем строку в файл на основании введенного набора параметров
                String a = String.format("\n%-8s%-30s%-8s%-4s", ++maxId, args[1], args[2], args[3]); // на этой строке запорол
//                две попытки, т.к. по условию между данными в файле нет пробелов
                FileWriter fileWriter = new FileWriter(fileName, true);
//            fileWriter.write(a);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(a);
                bufferedWriter.close();
            }
        }
    }
}

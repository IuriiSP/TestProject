import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution_9_11_12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);


    }

    public static void sort(String[] array) {

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) strings.add(array[i]);
            else numbers.add(Integer.parseInt(array[i]));
        }
            Collections.sort(strings);
            Collections.sort(numbers);
            Collections.reverse(numbers);

            int[] numbers1 = new int[numbers.size()];
            int j = 0;
            for (int i = 0; i < numbers.size(); i++) numbers1[i] = numbers.get(i);

            String[] strings1 = new String[strings.size()];
            int s = 0;
            for (int i = 0; i < strings.size(); i++) strings1[i] = strings.get(i);
            for (int i = 0; i < array.length; i++){
                if (!isNumber(array[i])) {
                    array[i] = strings1[s];
                    s++;
                }
                else {
                    array[i] = Integer.toString(numbers1[j]);
                    j++;
                }
            }
            for (String x : array) System.out.println(x);
            isGreaterThan("string1", "stringg2");



        }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*Ввести с клавиатуры 10 строчек и подсчитать в них количество
различных букв (для 33 маленьких букв алфавита).
Результат вывести на экран в алфавитном порядке.
Пример вывода:
а 5
б 8
...
я 9
 */
public class Solution_10_11_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> result = new LinkedHashMap<>();
        for(Character character : alphabet) {
            result.put(character, 0);
        }
        for (String s : list) {
            char[] charactersLine = s.toCharArray();
            for (char character : charactersLine) {
//проверить наличие символа в алфавите
                if (alphabet.contains(character)) {
//смотрим в нашу мапу, сколько раз уже встречались, если 0, т.е. ни разу, то кладем 1, если уже было,
//то увеличиваем на 1
                    Integer integer = result.get(character);
                    result.put(character, integer == 0 ? 1 : integer + 1);

                }
            }
        }

        result.forEach((character, integer) -> System.out.println(character + " " + integer));
    }
}


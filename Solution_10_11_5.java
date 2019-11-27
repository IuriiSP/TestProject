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
        for (int i = 0; i < 3; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < alphabet.size(); i++){
            result.put(alphabet.get(i), 0);
        }


        for (int i = 0; i < list.size(); i++){
            char[] ch = list.get(i).toCharArray();
            int count = 0;
            for (int j = 0; j < ch.length; j++){

                if (alphabet.contains(ch[j])) {//проверить попадание ch[j] в alphabet
                    count++;
                    result.put(alphabet.get(ch[j]), count);
                }
            }
        }

        System.out.println(result);
    }
}


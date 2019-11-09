import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Пять победителей
*/

public class Solution_8_11_8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        int a, b, t;
        for (a = 1; a < array.length; a++)
            for (b = array.length - 1; b >= a; b--){
                if (array[b - 1] < array[b]){
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
    }
}

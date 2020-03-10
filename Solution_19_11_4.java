package lvl_19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_19_11_4 {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "C:\\Games\\Search.txt";//br.readLine();
        br.close();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> lines = new ArrayList<>();
        while (reader.ready()){
            lines.add(reader.readLine());
        }
        reader.close();

        for (String s : lines){
            if (search(s) == 2) System.out.println(s);
        }


    }
    public static int search (String s){
        int count = 0;
        String [] arr = s.split(" ");
        for (String a : arr){
            for (String b : words){
                if (a.equals(b)) count++;
            }
        }


        return count;
    }
}

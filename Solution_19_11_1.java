package lvl_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution_19_11_1 {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        Map<String, Double> salarys = new TreeMap<>();
        while (br.ready()){
            String[] s = br.readLine().split(" ");
            salarys.merge(s[0], Double.parseDouble(s[1]), (a, b) -> b + salarys.get(s[0]));
        }
        br.close();
        salarys.forEach((a, b) -> System.out.println(a + " " + b));

    }
}

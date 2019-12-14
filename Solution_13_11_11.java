import java.io.*;
import java.util.*;

public class Solution_13_11_11 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine())!= null){
                list.add(Integer.parseInt(line));
            }
            reader.close();
            Collections.sort(list);
            for (Integer a : list){
                if (a % 2 == 0) System.out.println(a);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

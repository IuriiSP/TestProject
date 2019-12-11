import java.io.*;
import java.util.Scanner;

public class Solution_13_11_3 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        try{
            String fileName = null;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                fileName = reader.readLine();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            inputStream = new FileInputStream(fileName);
            buffer = new BufferedInputStream(inputStream);
            while(buffer.available() > 0){
                char c = (char)buffer.read();
                System.out.print(c);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            inputStream.close();
            buffer.close();

        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soluttion_15_12_9 {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String adress = reader.readLine();
//        reader.close();

//        Pattern p1 = Pattern.compile("\\&.*\\&");
        Pattern p1 = Pattern.compile("\\&\\w*[^\\&\\=]");
        Pattern p2 = Pattern.compile("[^\\&]\\w*[^\\&]");
        Pattern p3 = Pattern.compile("\\?\\w*[^\\&=]");
        Pattern p4 = Pattern.compile("[^\\?]\\w*");


        Matcher m1 = p1.matcher("alpha/index.html?lvl=15&view&name=Amigo");
        Matcher m3 = p3.matcher("alpha/index.html?lvl=15&view&name=Amigo");

        while (m3.find()){
            Matcher m4 = p4.matcher(m3.group());
            while (m4.find()) {
                System.out.print(m4.group() + " ");
            }
        }
        while (m1.find()) {
            Matcher m2 = p2.matcher(m1.group());

//            System.out.println(m1.group());
            while (m2.find()) {
                System.out.print(m2.group() + " ");
            }
        }



    }
    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}



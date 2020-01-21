import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DamnRegEx {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String test = reader.readLine();
        reader.close();
       // String test = "alpha/index.html?lvl=15&view&name=Amigo";
//        String test = "/alpha/index.html?obj=3.14&name=Amigo";
        Pattern words = Pattern.compile("(\\?|\\&)[^?&=]*"); //паттерн поиска слов
        Pattern clean_words = Pattern.compile("\\w[^?&=]*");// паттерн очистки слов
        Matcher m_words = words.matcher(test);
        Pattern obj = Pattern.compile("\\?[obj][^?&]*");//паттерн поиска obj в строке
        Matcher m_obj = obj.matcher(test);
        Pattern clean_obj = Pattern.compile("\\d*\\.\\d*"); //паттерн поиска значения obj в строке

        // Поиск слов в строке после символов & ?
        while (m_words.find()){
//            System.out.println(m_words.group());
            Matcher cl_w = clean_words.matcher(m_words.group()); // очистка найденного от знаков-ключей & ?
            while (cl_w.find()){
                System.out.print(cl_w.group() + " ");
            }
        }
        System.out.println();
    // Поиск в строке obj и его значения double;
        while (m_obj.find()){
//            System.out.print(m_obj.group());
            Matcher cl_obj = clean_obj.matcher(m_obj.group());
            while (cl_obj.find()){
                try{
                    double val = Double.parseDouble(cl_obj.group());
                    alert(val);
                    //System.out.println(cl_obj.group());
                }
                catch (Exception e){
                    alert(cl_obj.group());

                }
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
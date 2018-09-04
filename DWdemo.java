public class DWdemo {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        do {
            System.out.print("Нажмите нужную клавишу, а затем энтер");
            ch = (char) System.in.read(); // получить символ с клавиатуры
        } while (ch != 'q');

        }

}

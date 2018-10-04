public class Chapter311 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;
        int a = 0;
        System.out.println("Please enter a symbol");
        do {

            ch = (char) System.in.read();
                        if (ch != ' ');
                        else a++;

        }

        while (ch != '.');
        System.out.println("Вы ввели пробелов: " + a);

        System.out.println("The end");



    }
}
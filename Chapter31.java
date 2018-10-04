public class Chapter31 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;
        int counter;

        do {
            System.out.println("Жми блэд");
            ch = (char) System.in.read(); // получить символ с клавиатуры


                //counter1: //метка для опреатора break
                //for (counter = 0; ch == ' '; counter++) //цикл для подсчета количества пробелов
                   // if (ch != ' ') break counter1;

        }
        while (ch != '.'); //условие остановки выполнения программы
        System.out.println("The End");
    }
}


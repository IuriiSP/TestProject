public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, answer = 'S';

            System.out.println("Задумана буква из диапазона A - Z");
            System.out.print("Поробуйте ее угадать: ");

            ch = (char) System.in.read(); // получить символ с клавиатуры
        if(ch == answer) System.out.println("**Correct!**");
        else System.out.println("Нужная буква находиться");
        if (ch < answer)
            System.out.println("ближе к концу алфавита");
        else
            System.out.println("ближе к началу алфавита");
        }
    }


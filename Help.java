public class Help {
    public static void main(String[] args)
        throws java.io.IOException {
            char choice;
            System.out.println("Справка: \n 1. if \n 2. switch \n выберите");

            choice = (char) System.in.read();
            switch (choice) {
                case '1':
                    System.out.println("Опреатор if: \n \n if (условие) оператор; \n else оператор");
                    break;
                case '2':
                    System.out.println("Оператор witch: \n switch (выражение) { \n case константа: " +
                            "\n последовательность операторов \n break; \n //... \n }");
                    break;
                    default:
                        System.out.println("запрос не найден");
            }
        }
    }

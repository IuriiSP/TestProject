public class Help2 {
    public static void main(String[] args)
        throws java.io.IOException {
            char choice, ignore;

            do {
                System.out.println("Справка: ");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while\n");
                System.out.println("Выберите: ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                    } while (ignore != '\n');
                 } while (choice < '1' | choice > '5');
            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Опреатор if: \n \n if (условие) оператор; \n else оператор");
                    break;
                case '2':
                    System.out.println("Оператор witch: \n switch (выражение) { \n case константа: " +
                            "\n последовательность операторов \n break; \n //... \n }");
                    break;
                case '3':
                    System.out.println("Оператор for: \n \n for(инициализация; условие; итерация) \n оператор;");
                    break;
                case '4':
                    System.out.println("Опертор while:\n");
                    System.out.println("while(условие) оператор;");
                    break;
                case '5':
                    System.out.println("Оператор do-while:\n \n do { \n оператор; \n } while (условие);");
                    break;

            }
        }
    }

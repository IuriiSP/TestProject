public class HelpClassDemo
{
    void helpon (int what)
    {
        switch (what)
        {
            case '1':
                System.out.println("Оперетор if: \n");
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператор switch: \n");
                System.out.println("switch (выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Опертор for: \n");
                System.out.println("for(нициализация; условие; итерация)");
                System.out.println(" опертор");
                break;
            case '4':
                System.out.println("Опертор while: \n");
                System.out.println("while (условие) опертор");
                break;
            case '5':
                System.out.println("Опертор do-while:\n");
                System.out.println("do {");
                System.out.println(" опертор;");
                System.out.println("} while (условие;");
                break;
            case '6':
                System.out.println("Оператор break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Опертор continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
        System.out.println();

    }

    void showmenu ()
    {
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do - while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Выберите (q - выход): ");
    }
}

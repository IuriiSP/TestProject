public class StrOps
{
    public static void main (String args[])
    {
        String str1 = "Java - лидер интернета!";
        String str2 = new String(str1);
        String str3 = "лидер";

        int result, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());

        // Отобразить строку str1 посимвольно

        //for(int i = 0; i < str1.length(); i++)
            for(char a : str1.toCharArray())

            System.out.print(a);
        System.out.println();

        if (str1.equals(str2))
            System.out.println("Строка str1 эквивалентна str2");
        else System.out.println("Строка str1 не эквивалентна str2");

        if (str1.equals(str3))
            System.out.println("Строка str1 эквивалентна str3");
        else System.out.println("Строка str1 не эквивалентна str3");

        //result = str1.compareTo(str3);
        if (str1.compareTo(str3) == 0)
            System.out.println("st1 == str3");
        else if (str1.compareTo(str3) < 0)
            System.out.println("str1 < str3");
        else System.out.println("str1 > str3");
    }
}

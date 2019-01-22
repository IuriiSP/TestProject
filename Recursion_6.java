public class Recursion_6
{
    public static void main (String args[])
    {
        String str1 = "Строка для рекурсии";
       /* int a = str1.length() - 1;
        if (str1.charAt(a) == 0) return;
        else
        {
            System.out.print(str1.charAt(a));
            a--;
        }*/
    }
}
class Mthd
{
    char Mthd (String str2)
    {
        int a = str2.length() - 1;
        char result = Mthd(str2);
        if (result == 0) return str2.charAt(a + 1);
                   System.out.print(Mthd(str2));
            a--;
            return result;

    }
}

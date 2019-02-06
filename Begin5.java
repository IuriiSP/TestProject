import java.util.Scanner;
public class Begin5
{
    public static void main (String args[])
    {
        System.out.println("Уважаемый! Введи по-братски, ребро куба");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int v = a * a * a;
        int s = 6 * a;
        System.out.println("Объем куба " + v + " , пложадь поверхности " + s);

    }
}

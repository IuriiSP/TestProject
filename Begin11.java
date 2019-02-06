import java.util.Scanner;

public class Begin11
{
    public static void main(String args[])
    {
        System.out.println("ВВедите два ненулевых чила");
        int a = 0;
        int b = 0;
        do
            {
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
        }
        while (a == 0);
        do
            {
            Scanner scan = new Scanner(System.in);
            b = scan.nextInt();
        }
        while (b == 0);
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        System.out.println("Сумма модулей равна: " + (a1 + b1) + " ;разность модулей равна: "
                + (a1 - b1) + " произедение модулей равно: " + (a1 * b1)
                + " Частное модулей равно: " + (a1 / b1));
    }
}

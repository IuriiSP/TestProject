import java.util.Scanner;
public class Begin10
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
        int a2 = (a * a);
        int b2 = (b * b);

        System.out.println("Сумма квадратов равна: " + (a2 + b2) + " ;разность квадратов равна: "
                + (a2 - b2) + " произедение квадратов равно: " + (a2 * b2)
                + " Частное квадратов равно: " + (a2 / b2));
    }

    }

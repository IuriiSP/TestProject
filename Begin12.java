import java.util.Scanner;
public class Begin12
{
    public static void main(String args[])
    {
        System.out.println("ВВедите два ненулевых чила");
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        do
        {

            a = scan.nextInt();
        }
        while (a <= 0);
        do
        {
            b = scan.nextInt();
        }
        while (b <= 0);
        double c = Math.sqrt(a * a + b * b);
        double P = a + b + c;
        System.out.println("Гиппотенуза треугольника равна: " + c + " периметр: " + P);

    }
}

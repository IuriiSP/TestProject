import java.util.Scanner;
public class Begin15
{
    public static void main(String args[])
    {
        System.out.println("ВВедите площадь круга");
        double S;
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        do
        {
            S = scan.nextInt();
        }
        while (S <= 0);
        scan.close();
        double D = Math.sqrt((4 * S) / pi);
        double L = pi * D;
        System.out.println("Диаметр круга равен: " + D + " длина окружности: " + L);
    }
}

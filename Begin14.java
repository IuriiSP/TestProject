import java.util.Scanner;
public class Begin14
{
    public static void main(String args[])
    {
        System.out.println("ВВедите длину окружности");
        double L = 0;
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        do
        {
            L = scan.nextInt();
        }
        while (L <= 0);
        scan.close();
        double R = L / (2 * pi);
        double S = pi * R * R;
        System.out.println("Радиус круга равен: " + R + " площадь круга: " + S);
    }
}

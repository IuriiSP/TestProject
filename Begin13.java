import java.util.Scanner;

public class Begin13
{
    public static void main(String args[])
    {
        System.out.println("ВВедите два ненулевых чила");
        int R1 = 0;
        int R2 = 0;
        Scanner scan = new Scanner(System.in);
        do
        {
            R1 = scan.nextInt();
        }
        while (R1 <= 0);
        do
        {
            R2 = scan.nextInt();
        }
        while (R2 <= 0 | R2 >= R1);
        scan.close();
        double S1 = 3.14 * R1 * R1;
        double S2 = 3.14 * R2 * R2;
        double S3 = S1 - S2;
        System.out.println("Радиус первого круга равен: " + R1 + " второго круга: " + R2);
        System.out.println("Площадь первого круга равна: " + S1 + " второго круга: " + S2 + " кольца: " + S3);

    }
}

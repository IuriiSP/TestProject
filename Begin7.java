import java.util.Scanner;
public class Begin7
{
    public static void main (String args[])
    {
        System.out.println("Введи радиус");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double L = 2 * 3.14 * scan.nextInt();
        double S = 3.14 * r * r;
        System.out.println(L + " " + S);

    }
}

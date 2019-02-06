import java.util.Scanner;
public class Begin3
{
    public static void main (String args[])
    {
        System.out.println("Уважаемый, введи стороны прямоугольника");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int S = a * b;
        int P = 2 * (a + b);
        System.out.println("Уважаемый, по моим подсчетам " +
                "площадь твоего прямоугольника равна: " + S + " ,а периметр: " + P);
    }
}

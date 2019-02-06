import java.util.Scanner;
public class Begin9
{
    public static void main (String args[])
    {
        System.out.println("Введи два числа, сука");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = Math.sqrt(a * b);
        System.out.println(c);
    }
}

import java.util.Scanner;
public class Begin16
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();
        c = Math.abs(b - a);
        System.out.println("Растояние между a(" + a + ") и b(" + b + ") равно: " + c);
    }
}

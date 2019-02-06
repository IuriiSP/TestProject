import java.util.Scanner;
public class Begin6
{
    public static void main (String args[])
    {
        System.out.println("Уважаемый! Введи по-братски, ебра паралелепипеда");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int v = a * b * c;
        int s = 2 * (a * b + b * c + a * c);
        System.out.println("Уважаемый, объем " + v + " площадь " + s);

    }
}
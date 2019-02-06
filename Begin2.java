import java.util.Scanner;
public class Begin2
{
    public static void main (String args[])
    {
        System.out.println("Уважаемый, введи сторону квадрата, я тебе площадь посчитаю");
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        int S = side * side;
        System.out.println("Уважаемый, спешу сообщить, что площадь твоего квадрата равна: " + S);

    }
}

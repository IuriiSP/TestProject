import java.util.Scanner;
public class Begin4
{
    public static void main (String args [])
    {
        System.out.println("Уважаемый, введи диаметр окружности");
        Scanner scan = new Scanner(System.in);
        double L = scan.nextInt() * 3.14;
        System.out.println("Уважаемый, длинна твоей окружности " + L);
    }
}

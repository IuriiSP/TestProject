import java.util.Scanner;
public class Begin19
{
    public static void main (String args[])
    {
        System.out.println("Введите координаты вершин");
        Scanner scan = new Scanner(System.in);
        int x1, y1, x2, y2, P, S;
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        do
        {
           x2  = scan.nextInt();
        }
        while (x1 == x2);

        do
        {
            y2 = scan.nextInt();
        }
        while (y1 == y2);
        scan.close();
        P = Math.abs((x1 - x2) * 2 + (y1-y2) * 2);
        S = Math.abs((x1 - x2) * (y1-y2));
        System.out.println("Периметр прямогульника равен: " + P + " , площадь прямоугольника: " + S);

    }
}

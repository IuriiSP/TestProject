import java.util.Scanner;
public class Begin1
{
    public static void main(String[] args)
    {
        System.out.println("Уважаемый! Введи по-братски, сторону квадрата");
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        int P;
        P = side * 4;
        System.out.println("Уважаемый, периметр твоего квадрата равен " + P);
    }
}


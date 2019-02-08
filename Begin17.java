import java.util.Scanner;
public class Begin17
{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, ac, bc, d;
        a = scan.nextInt();
        do
        {
            b = scan.nextInt();
        }
        while (a >= b);

        do
        {
            c = scan.nextInt();
        }
        while (b >= c);
        scan.close();
        ac = Math.abs(a - c);
        bc = Math.abs(b - c);
        d = ac + bc;
        System.out.println(ac + " " + bc + " " + d);
    }
}

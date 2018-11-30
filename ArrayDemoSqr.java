public class ArrayDemoSqr
{
    public static void main (String args [])
    {
        int sample[] = new int[5];
        int i, a = 1;

        for (i = 0; i < 5; i = i + 1)
        {
            for (a = 1; a <= (i * 2) + 1;a++)
            sample[i] = a * a;

        }
        for (i = 0; i < 5; i = i + 1)
            System.out.println("Элемент [" + i + "]: " + sample[i]);
    }
}

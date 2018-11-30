public class ArrayDemo2 {
    public static void main(String args[]) {
        int sample[] = new int[5];
        int i, j;

        for (i = 0; i < 5; i++)
            for (j = 1; j <= (i * 2) + 1; j++)
                sample[i] = j;




            for (i = 0; i < 5; i = i + 1)
                System.out.println("Элемент [" + i + "]: " + sample[i]);

    }
}
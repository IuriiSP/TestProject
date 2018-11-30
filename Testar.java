public class Testar
{
    public static void main (String args [])
    {
        int t, i, x = 1;
        int table[][] = new int[6][5];

        for (t = 0; t < 6; ++t)
        {
            for (i = 0; i < 5; ++i)
            {
                table[t][i] = x * x;
                    x = x + 2;

                    System.out.print(table[t][i] + " ");
                   // else table[t][i] = (t * 5) + i + 1;
                    //System.out.print(table[t][i] + " ");


            }
            System.out.println();
        }
    }
}
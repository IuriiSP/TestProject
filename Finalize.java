class FDemo
{
    int x;
    FDemo (int i)
    {
        x = i;
    }
    //Вызывается при удалении объекта

    protected void finalize()
    {
        System.out.println("Финализация " + x);
    }
    //Генерирует объект который тот раз уничтожается

    void generator (int i)
    {
        FDemo o = new FDemo(i);
    }
}


public class Finalize
{
    public static void main (String args [])
    {
        int count;

        FDemo ob = new FDemo(0);

        /* генерируется большое количество объектов. В какой-то момент времени
        должна начатся сборка мусора.
         */

        for (count = 1; count < 1000000; count++)
            ob.generator(count);
    }
}

public class Rectangle
{
    int lenght;
    int width;

    Rectangle (int l, int w) //конструткор для объекта
    {
        lenght = l;
        width = w;
    }

    int Perimeter ()
    {
        return lenght * 2 + width * 2;
    }

    int Figure_area ()
    {
        return lenght * width;
    }
}

class Calculation2
{
    public static void main (String args [])
    {
        Rectangle first = new Rectangle(2,4);
        Rectangle second = new Rectangle(7, 12);
        Rectangle third = new Rectangle(10, 5);

        System.out.println("Периметр первого прямоугольника составляет " + first.Perimeter() + " Площадь " + first.Figure_area());
        System.out.println("Периметр второго прямоугольника составляет " + second.Perimeter() + " Площадь " + second.Figure_area());
        System.out.println("Периметр второго прямоугольника составляет " + third.Perimeter() + " Площадь " + third.Figure_area());
    }
}
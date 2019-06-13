public class TwoDShape
{
    private double width; // эти переменные объявленны как закрытые
    private double height;


    //Конструктор по умолчанию
    TwoDShape ()
    {
        width = height = 0.0;
    }
    //Параметризированный конструктор
    TwoDShape (double w, double h)
    {
        width = w;
        height = h;
    }

    // Конструирование объекта с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape(double x)
    {
        width = height = x;
    }

    // Мтеоды доступа к закрытым переменным экземляра width и height
    double getWidth () {return width;}
    double getHeight () {return height;}
    void setWidth (double w) {width = w;}
    void setHeight (double h) {height = h;}

    void showDim ()
    {
        System.out.println("Ширина и высота - " + width + " и " +  height);

    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape

class Triangle extends TwoDShape
{
    private String style;

    //Конструктор по умолчанию
    Triangle ()
    {
       super(); // Вызвать конструктор суперкласса по умолчанию
        style = "none";

    }

    // Конструктор
    Triangle (String s, double w, double h)
    {
        super(w, h); // вызвать конструктор суперкласс с двумя аргументами

        style = s;
    }

    // Коснтруктор суперкласса с одним аргументом
    Triangle (double x)
    {
        super(x); // вызвать конструктор суперкласса с одним аргументом

        style = "закрашенный";
    }
    double area ()
    {
        return getWidth() * getHeight() / 2;
    }

    void showStyle ()
    {
        System.out.println("Треугольник " + style);
    }
}

class Shapes
{
    public static void main (String args[])
    {
        Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
        Triangle t2 = new Triangle("контурный", 8.0, 12.0);

        System.out.println("информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь t1 " +  t1.area());

        System.out.println();

        System.out.println("Информация о t2: " );
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь t2 " +  t2.area());
    }
}
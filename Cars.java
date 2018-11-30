public class Cars
{
    int year_of_issue; //год выпуска автомобиля
    int engine_power; //мощность двигателя
    int car_type; //1 - легковой/ 2 - грузовой

    Cars (int y, int e,int c) //конструктор класса Cars
    {
        year_of_issue = y;
        engine_power = e;
        car_type = c;
    }
    //определить дорожный налог

    double transport_tax ()
    {
        if (car_type == 1)
        {
            if (engine_power <= 100) return engine_power * 2.5;
            else if (engine_power <= 150) return engine_power * 3.5;
            else if (engine_power <= 200) return engine_power * 5;
            else if (engine_power <= 250) return engine_power * 7.5;
            else return engine_power * 15;
        }
        else if (engine_power <= 100) return engine_power * 2.5;
        else if (engine_power <= 150) return engine_power * 4;
        else if (engine_power <= 200) return engine_power * 5;
        else if (engine_power <= 250) return engine_power * 6.5;
        else return engine_power * 8.5;

        }
    }

class calculation
{
    public static void main (String args [])
    {
        //полностью сконструировать экземпляры класса

        Cars zil = new Cars(2008, 150, 2);
        Cars vaz = new Cars(2014, 150, 1);

        double tax;

        tax = zil.transport_tax ();
        System.out.println("Транспортный налог на автомобиль ЗИЛ с мощностью " + zil.engine_power + " составит " + tax);

        tax = vaz.transport_tax();
        System.out.println("Транспортный налог на автомобиль ВАЗ с мощностью " + vaz.engine_power + " составит " + tax);
    }
}

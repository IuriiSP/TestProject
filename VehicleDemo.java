class Vehicle
{
    int passengers; // количество пассажиров
    int fuelcap; // объем топливного бака
    int mpg; // расход топлива миль/галлон

    // это конструктор класса Vehicle

    Vehicle (int p, int f, int m)
    {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    // Определить дальность поездки транспортного средства
    int range ()
    {
        return mpg * fuelcap;
    }


    double fuelneeded (int miles)
    {
        //рассчитать объем топлива необходимый тс для преодоления заданного расстояния
        return (double) miles / mpg;
    }
}

// В этом классе объявляется объект типа Vehicle

class AddMeth
{
    public static void main (String args [])
    {
        //Полностью сконструировать объекты транспортных средств
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль минифургону требуется " + gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спорткару требуется " + gallons + " галлонов топлива");

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + "пассажиров. ");
        System.out.println("Дистанция минивена " + minivan.range()); //отобразить дальность поездки минифургона

        System.out.println("Спортивный автомобиль может перевезти " + sportcar.passengers + " пассажиров. ");
        System.out.println("Дистанция спорткара " + sportcar.range()); //отобразить дальность поездки спортивного автомобиля
    }
}
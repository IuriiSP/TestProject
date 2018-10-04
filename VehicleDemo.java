class Vehicle
{
    int passengers; // количество пассажиров
    int fuelcap; // объем топливного бака
    int mpg; // расход топлива миль/галлон

    // отобразить дальность поездки транспортного средства

    void range ()
    {
        System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }

    double fuelneeded (int miles)
    {
        //рассчитать объем топлива необходимый тс для преодоления заданног расстояния
        return (double) miles / mpg;
    }
}

// В это м классе объявляется объект типа Vehicle

class AddMeth
{
    public static void main (String args [])
    {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int dist = 252;


       // int range1, range2;

        //присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //присвоить значения полям в объекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль минифургону требуется " + gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спорткару требуется " + gallons + " галлонов топлива");

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + "пассажиров. ");
        minivan.range(); //отобразить дальность поездки минифургона

        System.out.print("Спортивный автомобиль может перевезти " + sportcar.passengers + " пассажиров. ");
        sportcar.range(); //отобразить дальность поездки спортивного автомобиля
    }
}
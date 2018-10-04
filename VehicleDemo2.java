class Vehicle2
{
    int passengers; // количество пассажиров
    int fuelcap; // объем топливного бака
    int mpg; // расход топлива миль/галлон

    // отобразить дальность поездки транспортного средства

    int range ()
    {
    return fuelcap * mpg;
    }
}

// В это м классе объявляется объект типа Vehicle

class RetMeth
{
    public static void main (String args [])
    {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();

        int range1, range2; //можно не использовать если применить метод range через точечную нотацию

        //присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //присвоить значения полям в объекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        //получить дальность поездки для разных транспортных средств
        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + "пассажиров на расстояние " + minivan.range() + " миль" );
        minivan.range(); //отобразить дальность поездки минифургона

        System.out.print("Спортивный автомобиль может перевезти " + sportcar.passengers + " пассажиров на расстояние " + sportcar.range() + " миль");
        sportcar.range(); //отобразить дальность поездки спортивного автомобиля
    }
}
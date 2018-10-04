public class TwoVehicles
{
    public static void main (String args [])
    {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        //присвоить значения полям в объекте minivan

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //присвоить значения полям в объекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        //рассчитать дальность поездки при полном баке

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Минивэн может перевести " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль");
        System.out.println("Спорткар может перевести " + sportcar.passengers + " пассажиров на расстояние " + range2 + " миль");
    }
}

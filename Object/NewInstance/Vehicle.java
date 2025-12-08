// Program to create object using newInstance() method

public class Vehicle {
    public static void main(String[] args) throws Exception {

        // creating and accesing ojects using newInstance method
        Car c = Car.class.newInstance();

        c.name = "Defender";
        c.speed = 150;
        c.price = 1000000.221;

        c.carDetails();

        // Bike object
        Bike b = Bike.class.newInstance();

        b.name = "DUKE";
        b.speed = 120;
        b.price = 180000.223;

        b.bikeDetails();
    }
}

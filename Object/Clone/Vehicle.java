// Program to create object using clone() method

public class Vehicle {
    public static void main(String[] args) throws Exception {

        // creating and accesing ojects using newInstance method
        Car c1 = new Car("Defender", 150, 1000000.221);

        c1.carDetails();

        Car c2 = (Car) c1.clone();

        c2.carDetails();

    
    }
}

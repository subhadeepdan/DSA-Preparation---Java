class Vehicle
{
    int value = 100;
    void start() {
        System.out.println("Vehicle Started");
    }

    static void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {

    int value = 1000;

    @Override
    void start() {
        System.out.println("Car Started");
    }

    static void stop() {
        System.out.println("Car Stopped");
    }

    public static void main(String args[]) {

        // Car extends Vehicle
        Vehicle vehicle = new Car();
        System.out.println(vehicle.value);
        vehicle.start();
        vehicle.stop();

        Car car = new Car();
        car.start();
        car.stop();

        Vehicle vehicle1 = null;
        vehicle1.stop();
    }
}
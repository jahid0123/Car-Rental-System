public class Main {
    public static void main(String[] args) {

        CarRentalSystem carRentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Thar", "Mahindra", 150);
        Car car2 = new Car("C002", "Axio", "Toyota", 160);
        Car car3 = new Car("C003", "Santa", "Honda", 170);

        carRentalSystem.addCar(car1);
        carRentalSystem.addCar(car2);
        carRentalSystem.addCar(car3);

        carRentalSystem.menu();
    }
}
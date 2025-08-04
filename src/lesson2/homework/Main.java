package lesson2.homework;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 2010);
        Car car2 = new Car("Chevrolet", "Cobalt", 2024);
        Car car3 = new Car("BYD", "Destroyer", 2024);

        System.out.println("Car 1: " + car1.showDetails());
        System.out.println("Car 2: " + car2.showDetails());
        System.out.println("Car 3: " + car3.showDetails());
    }
}

class Car {
    String brand;

    void display() {
        System.out.println("Car brand: " + brand);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "BMW";
        c.display();
    }
}

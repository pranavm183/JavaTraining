package oopsConcepts;

class Car {
    void applyBrake() { // Tip: Use camelCase for method names in Java
        System.out.println("Brakes are applied");
    }
}

// 1. Added "extends Car" to establish the parent-child relationship for overriding
class Tata extends Car {
	@Override // Optional but recommended annotation to ensure correct overriding
    void applyBrake() {
        System.out.println("Tata Brakes are applied");
    }
}

public class MethodOverrideDemo2 {
    // 2. Placed the execution logic inside the main method
    public static void main(String[] args) {
        
        // Polymorphism: Parent reference pointing to a Child object
        Car car = new Car();
        car.applyBrake(); // Outputs: Tata Brakes are applied
        
        // Child reference pointing to a Child object
        Tata tata = new Tata();
        tata.applyBrake(); // Outputs: Tata Brakes are applied
    }
}

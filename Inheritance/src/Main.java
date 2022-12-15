class Transport {
    String species;
    public void ride() {
        System.out.println("I cover a long way quickly");
    }
}
class Car extends Transport {
    String marks;
    public void species() {
        System.out.println("This - " + species);
    }
    public void characteristics() {
        System.out.println("Marks: " + marks);
    }
}

class Main {
    public static void main(String[] args) {
        Car audi = new Car();

        audi.species = "Car";
        audi.marks = "Audi";
        audi.species();
        audi.characteristics();
        audi.ride();

    }
}
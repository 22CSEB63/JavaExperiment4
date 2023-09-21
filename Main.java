// Define the Printable interface
interface Printable {
    void print();
}

// Rectangle class implementing Printable
class Rectangle implements Printable {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void print() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Breadth: " + breadth);
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

// SportsCar class implementing Printable
class SportsCar implements Printable {
    private String brandName;
    private String model;
    private double price;

    public SportsCar(String brandName, String model, double price) {
        this.brandName = brandName;
        this.model = model;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Sports Car Brand: " + brandName);
        System.out.println("Sports Car Model: " + model);
        System.out.println("Sports Car Price: $" + price);
    }
}

// Manager class implementing Printable
class Manager implements Printable {
    private String name;
    private int age;
    private String employeeID;
    private double salary;

    public Manager(String name, int age, String employeeID, double salary) {
        this.name = name;
        this.age = age;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Age: " + age);
        System.out.println("Manager Employee ID: " + employeeID);
        System.out.println("Manager Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects for Rectangle, SportsCar, and Manager
        Printable rectangle = new Rectangle(5.0, 3.0);
        Printable sportsCar = new SportsCar("Ferrari", "488 GTB", 250000.0);
        Printable manager = new Manager("Sri Krishna", 35, "EMP123", 75000.0);

        // Print details of each object
        System.out.println("Rectangle Details:");
        rectangle.print();
        System.out.println();

        System.out.println("Sports Car Details:");
        sportsCar.print();
        System.out.println();

        System.out.println("Manager Details:");
        manager.print();
    }
}

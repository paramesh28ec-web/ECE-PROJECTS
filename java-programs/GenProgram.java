class Boxes<T>{
    T item;

    void store(T item){
        this.item = item;
    }

    T retrieve(){
        return this.item;
    }
}

class Car{
    String brand;
    String model;
    int year;
    double price;

    Car(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

class GenProgram{
    public static void main(String[] args) {

        Boxes<Car> carBox = new Boxes<>();

        Car car1 = new Car("Toyota", "Supra", 2023, 8500000);

        carBox.store(car1);

        Car retrievedCar = carBox.retrieve();

        retrievedCar.display();
    }
}
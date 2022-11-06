package constructors;

public class Car {
    //Constructors do not have return type
    public Car()
    {
        System.out.println("non-paramethers cons");
    }
    public Car(String color)
    {
        System.out.println("created new "+color+" Car");
    }
    public Car(int year)
    {
        System.out.println("non-paramethers cons");
    }

    public Car(int year, String color) {
        System.out.println(year+" Model"+color+"  Car produced");
    }
}

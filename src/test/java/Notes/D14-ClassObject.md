# Class a& Object


## What is a class?
 * A class is a blueprint for creating an object in java. It defines properties(variables) and
   behaviors(methods) that the object of the calss wil have.
 * Think of class ad a template. For Ex, a `car` class might define attributes like `color`,
   `model`, and behaviours like `drive()` or `stop()`.


## What is an Object?
 * An object is an instance of a class. When you create an object, you are bringing the blueprint(class) to life.
 * Each object can have its own value for the attribute defined in the class.

#### Example

```java
class Car{
    String color; //Attribute (Property of the class) (Class variable)
    void drive(){ //Method for hte Car class(behaviour for the object)
        System.out.println("The car is driving");
    }
}

public class TestCars{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        //now the color of myCar object is red
        Car yourCar = new Car();
        yourCar.color = "black";
        System.out.println(myCar.color);
        System.out.println(yourCar.color);
    }
}
```

















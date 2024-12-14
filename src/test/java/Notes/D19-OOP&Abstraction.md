# super(), this(), this, super
## super()
* `super()` is used to call constructor of the parent(super) class. And it can be called
  only once in a constructor.
* It must be called as first thing in constructor.
* Since every subclass(childclass) has to implement constructor of their super(parent) class
  this calling makes it easier to do.

## this()
* `this()` is used to call constructor of the same class. And it can be called once in a constructor.
* It must be called as a first thing in constructor.
* When a class has multiple constructors and for different constructor if you want to implement other
  ones you could call it.
```java
 public Employee(String name, String department, int yearsOfExperience, String title){
    this(name,department);
    this.yearsOfExperience = yearsOfExperience;
    this.title = title;
}

public Employee(String empName,String departmentName, int experience){
    this(empName,departmentName);
    yearsOfExperience = experience;
}
public Employee(String name, String department){
    System.out.println("This is the common constructor");
    this.name = name;
    this.department = department;
}
```
## super
* `super` keyword allows you to call parent class instance variables.

## this
* `this` keyword allows you to call current class instance variables.


# ABSTRACTION
* **Abstraction** is the process of showing only the relevant details to the user and hiding the implementation.
* In Java, abstraction is achieved by using `abstract classes` and `interfaces`.
* It is useful for defining a common structur or behavior that multiple classes can share
  without providing specific implementation.

## Abstract Class
* A class declared with abstract keyword.
* Cannot be instantiated.(You cannot create an object out of abstract class.)
* Can have both abstract methods(without implementation), and `concrete methods`(with implementation.)
* Can have instance variables and constructors.
```java 
abstract class Vehicle{
    
}
```

## Abstract Methods
* Declared with abstract keyword, and it has no method body(no implementation).
* **Must** be implemented by the subclasses.
```java
abstract public void calculate();
```

# Interfaces
* An interface is a blueprint of a class that contains only method declarations(abstact methods),
  and constant variables.(fields declared as, public, static, and final. )
* `final` keyword could be used for variables or methods, which prevents methods or variables to change.
* `final` variables cannot be reassigned. `final` methods cannot be overriden.
* Interfaces specify the behavior that a class must implement without providing an implementation.
## Features of Interfaces
1. **Method Declarations Only**
```java 
public interface Drawable{
    void draw();  // This is an abstract method. Unlike the abstract class, we don't have to use 
    // abstract keyword to make methods abstract.
}
```
2. **Constants Only**
* Variables in an interface are implicitly `public`, `static` and `final`.
```java 
public interface TrafficRules{
    int MAX_SPEED = 100; // This MAX_SPEED variable is public, static and final.
}
```
3. **Default and Static Methods**
* Interfaces can have
    1. Default Methods: Methods with a body to provide a default behavior
     ```java 
      public interface test{
         default void defaultMethodExample(){
       System.out.println("Interface method with a body.");        
  }
          } 
     ```

    2. Static Methods: Methods that belong to interface itself.
    ```java 
    public interface staticTest{
        static void printDetails(){
     System.out.println("Contains details about interface.");    
  }
  }
... (87 lines left)
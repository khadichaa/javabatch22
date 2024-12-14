

# Static
- 'static' keyword, makes methods/objects belong to a class.

## Static Variable

* A static variable belongs to the class, not to any specific object.
* It is shared among all instance(objects) of the class
* **Key Points**
    * Declared using the `static` keyword
    *  Memory is allocated once the class is loaded.
    * Can be accessed using the **class name**. (e.g., `ClassName.VariableName`).
    * Useful for constants or data shared across all objects



## Non-Static Variables

* A non-static variable belongs to a specific object.
* Each object has its own copy of the variable/
* **Key Points**
    * Declared without the `static` keyword
    *  Memory is allocated once the object is created.
    * **Can ONLY** be accessed using an object of hte class (e.g., `ClassName.VariableName`).
    * Useful for storing data unique to each object



## Static Methods

* Usually used for creating a common logic that will affect all objects
* If you want to be able to use methods without creating an object then you can make it static.
* In static method, you cannot call non static instance variables


## Non-Static Methods

* Used for logics that will affect each object
* It could access both `static` and `non-static` variables
* to call these methods we must create an object






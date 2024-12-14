
# String Object


## What is an Object in Java?
- An object in java is an instance of a class that has state (attribute, fields, methods) and behavior (methods).
- String in Java is an **object** because it is an instance the `String` class, which has both
  attributes (e.g., the character sequence it stores) and methods (e.g, length(), substring() etc.)


## What makes a String an Object?
- String is a reference type, created from `String` class, unlike primitives 
  which are type directly representing values.


## Features of String
1. **Immutable**
    * Once a `String` object is created, it cannot be modified. Any modification creates a new `String` object.
    * This immutability improves security, makes String objects `thread-safe`, and helps with memory optimization.


2. **Methods For String Manipulation**

### Using String
1. Creating a String Object

```java
String school = "Techtorial";
```


2. String Object Uses **Indexes** To Access Each Element

```java
//First
String progLanguage = "Java";
```




## Common String Methods
1. **Concat** Method
* Concatenates(joins) the given string to the end of another string.
* Syntax Formula
```java
stringObjectName.concat(anotherStringObject);
```
* Example Usage
```java
String s = "JAva";
String s2 = "Programming";
System.out.println(s.concat());
```

 * **NOTE!** : Since the string object is immutable, it will never change its value **UNLESS** the string object 
is reassigned.

2. **Length** Method
* **Return Type**: integer value
* **Description**: Returns the total number of characters in a string. 
* **Example**:

``` java
String s = " Java! ";
System.out.println(s.length()); // 7
```

3. **CharAt** Method
* **Return Type**: char value
* **Description**: Returns the character at specific **index**.
* **Caution**: When index number that doesn't exist in string used it will throw
  **StringIndexOutOfBoundsException**.
* **Example**:
* 
``` java
String text = "Hello Java!";
System.out.println(text.charAt(3)); // l
System.out.println(text.charAt(1)); // e

String s = 't';
System.out.println(s); // Compile time error
// Single quotation means that data type is `char`.
// `char` values cannot directly be assigned at String.
String character = text.charAt(6); // Output: compile time error
// because `charAt` method d gives us a char value which cannot be assigned String directly. 

// If you want to assign output of charAt method directly to a String object, you can add to empty string. 
text = "Hello Java!";
String ch = "" + text.charAt(4); // the value of ch will be o.



```























# ☕ Java Data Types and Variables

In Java, data types define the kind of data a variable can hold. They are broadly classified into:

- **Primitive Types**
- **Reference Types**

---

## 🔹 Primitive Data Types

Java has 8 built-in **primitive data types**. These are predefined by the language and store **simple values**.

### ✅ List of Primitive Types

| Type     | Size     | Default Value | Description                         |
|----------|----------|----------------|-------------------------------------|
| `byte`   | 8-bit    | 0              | Small integer (-128 to 127)         |
| `short`  | 16-bit   | 0              | Larger than byte (-32k to 32k)      |
| `int`    | 32-bit   | 0              | Standard integer (-2B to 2B)        |
| `long`   | 64-bit   | 0L             | Large integer values                |
| `float`  | 32-bit   | 0.0f           | Decimal numbers, less precision     |
| `double` | 64-bit   | 0.0d           | High-precision decimal numbers      |
| `char`   | 16-bit   | '\u0000'       | Single Unicode character            |
| `boolean`| 1-bit    | false          | Only `true` or `false`              |

> 📝 Primitive types store actual values in memory.

### 🔸 Example

```java
int age = 30;
float price = 99.99f;
char grade = 'A';
boolean isActive = true;
```

---

## 🔷 Reference Types in Java

In Java, **reference types** refer to objects, arrays, or instances of classes and interfaces. Unlike primitive types, which store the actual value, reference types **store the memory address** (or reference) to where the object data is located in the heap memory.

---

### ✅ Common Reference Types

| Type         | Description                                                  | Example                      |
|--------------|--------------------------------------------------------------|------------------------------|
| **Class**    | Any object created from a class is a reference type          | `String`, `Scanner`, custom `Person` class |
| **Array**    | Arrays are objects in Java, even if they hold primitive types| `int[]`, `String[]`, `double[][]` |
| **Interface**| Variables can hold objects of classes that implement interfaces | `Runnable`, `Comparable`   |
| **Enum**     | User-defined constants grouped in an enumerated type         | `Day.MONDAY`                |

---

### 🧪 Examples of Reference Type Usage

```java
// Class reference
String name = "Alice";

// Array reference
int[] numbers = {1, 2, 3};

// Custom object
Person p = new Person("John");

// Interface reference
Runnable task = () -> System.out.println("Running...");

// Enum reference
Day today = Day.MONDAY;
```

---

## 🧠 Variables in Java

A **variable** in Java is a name given to a memory location that stores data. Every variable has:

- A **type** (what kind of data it can hold)
- A **name**
- A **value** (optional at declaration)

---

### 📌 Syntax

```java
<type> <variable_name> = <value>;
int age = 30;
String name = "Alice";
```

---

### 🗂️ Types of Variables in Java

Java variables fall into **three main categories** based on their declaration location, scope, and memory usage:

| Type      | Declared In                                | Scope & Lifetime                    | Memory        |
|-----------|---------------------------------------------|-------------------------------------|---------------|
| **Local** | Inside a method, block, or constructor      | Exists during method execution only | Stack         |
| **Instance** | Inside a class (non-static)              | Exists for each object instance     | Heap          |
| **Static** | Inside a class (with `static` keyword)     | Shared among all instances of class | Method Area   |


### 🔹 Local Variables

- Declared inside methods or blocks
- Must be initialized before use
- Not accessible outside the method or block

```java
public void greet() {
    String message = "Hello!";
    System.out.println(message);
}
```

🧠 Note: Local variables do not have a default value. You must assign a value before using them.

---

### 🔸 Instance Variables (Object/Field Variables)

- Declared inside a class, but **outside any method**
- Belong to a **specific instance** of the class
- Automatically initialized to **default values** if not explicitly set

```java
public class Dog {
    String breed;     // Instance variable
    int age = 5;      // Initialized
}
```

🧠 Each object has its own copy of instance variables.

---

### 🔸 Static Variables (Class Variables)

- Declared with the `static` keyword
- Shared among **all instances** of the class
- Used for values that are **common to every object**

```java
public class Car {
    static int wheels = 4;  // Static variable
    String model;
}
```

🧠 Can be accessed using the class name: Car.wheels

---

### 🎯 Default Values of Variables

Only **instance** and **static** variables get default values:

| Type     | Default Value |
|----------|----------------|
| `int`    | `0`            |
| `float`  | `0.0f`         |
| `boolean`| `false`        |
| `char`   | `'\u0000'`     |
| `Object` | `null`         |

> ❗ **Local variables** do **not** get default values and must be **explicitly initialized**.

---

### ⚠️ Variable Naming Rules

- Must begin with a **letter**, `$`, or `_`
- Cannot begin with a **number**
- Cannot use **Java reserved keywords**
- **Case-sensitive** (`myVar` ≠ `myvar`)
- Use **camelCase** by convention

#### ✅ Good Examples:

```java
int studentAge;
String fullName;
boolean isLoggedIn;
```

---

### 🔄 Variable Declaration Styles

```java
int x;             // Declaration
x = 10;            // Assignment
int y = 20;        // Declaration + Assignment
```

---

### 🧪 Example: All Three Variable Types

```java
public class Example {
    static int count = 0;        // Static variable
    String name;                 // Instance variable

    public void show() {
        int localVar = 100;      // Local variable
        System.out.println(name + ": " + localVar);
    }
}
```

---

### 🧠 Best Practices

- Use meaningful variable names (e.g., `maxScore`, `isAvailable`)
- Keep variables as local as possible
- Use `final` to create constants:

```java
final double PI = 3.14159;
```

---

### 🔁 Variable Scope Summary

| Variable Type | Scope         | Lifetime                  | Initialized By    |
|----------------|---------------|----------------------------|--------------------|
| **Local**      | Method/block  | Until method exits         | Developer          |
| **Instance**   | Class          | As long as object exists   | Java (default)     |
| **Static**     | Class (`static`) | As long as class is loaded | Java (default)   |
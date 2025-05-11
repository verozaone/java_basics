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

### 🆕 Using var (Java 10+)

Starting from Java 10, you can use the var keyword for local variables to let the compiler infer the type:

#### ✅ Basic Examples

```java
var age = 30;                         // inferred as int
var name = "Alice";                   // inferred as String
var price = 99.99;                    // inferred as double
var isValid = true;                   // inferred as boolean
var list = new ArrayList<String>();  // inferred as ArrayList<String>
```

#### ✅ In Loops

```java
var numbers = List.of(1, 2, 3, 4);

for (var num : numbers) {
    System.out.println(num);  // inferred as Integer
}
```

#### ✅ With Streams

```java
var names = List.of("Alice", "Bob", "Charlie");

var upperNames = names.stream()
                      .map(n -> n.toUpperCase())
                      .toList();  // inferred as List<String>
```

#### ✅ With Map Entries

```java
var map = Map.of("a", 1, "b", 2);

for (var entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());  // entry inferred as Map.Entry<String, Integer>
}
```

#### ✅ With Lambda Expressions (as result of assignment)

```java
var greeter = (Runnable) () -> System.out.println("Hello!");
greeter.run();  // inferred as Runnable
```

#### ✅ With Arrays

```java
var items = new String[]{"apple", "banana", "cherry"};  // inferred as String[]
```

#### 🧠 Notes

- `var` only works for local variables (inside methods, constructors, blocks)
- Type is inferred at compile-time, not runtime
- Improves code readability in some cases but may hurt clarity if overused

✅ var is not a data type. It's a keyword for type inference used only for local variables.

#### ⚠️ var Limitations

- ❌ Cannot be used for instance or static variables
- ❌ You must initialize the variable at the time of declaration
- ✅ Works only within methods, constructors, or blocks
  
### ❌ Invalid Usages of `var` in Java

The `var` keyword has **strict rules** in Java. Below are common incorrect usages and why they fail.

#### 🚫 1. Declaration without initialization

```java
var x;  // ❌ Error: Cannot use 'var' without initializer
```

> ❓ **Why is this invalid?**  
> Java must **infer the type from the assigned value**.  
> If no value is provided at the time of declaration, the compiler cannot determine the type, and **type inference fails**.

#### 🚫 2. Used as a method parameter

```java
public void setName(var name) {  // ❌ Error: 'var' is not allowed here
    System.out.println(name);
}
```

> ❓ **Why is this invalid?**  
> The `var` keyword can **only be used for local variables** inside methods, constructors, or blocks.  
> It **cannot** be used for **method parameters** or **return types**, as type inference in those contexts is not supported by the Java compiler.

#### 🚫 3. Used as a return type

```java
public var getData() {  // ❌ Error: 'var' cannot be used as a return type
    return "Data";
}
```

> ❓ **Why is this invalid?**  
> In Java, **method return types must be explicitly declared**.  
> The `var` keyword is intended **only for local variable declarations**, not for method signatures.

#### 🚫 4. Used for instance or static variables (fields)

```java
class Example {
    var count = 0;  // ❌ Error: 'var' not allowed in class fields
}
```

> ❓ **Why is this invalid?**  
> Java does **not allow `var` for fields** (instance or static variables).  
> The `var` keyword is **restricted to local variables** declared within methods, constructors, or blocks.

#### 🚫 5. Used with array initialization without type context

```java
var numbers = {1, 2, 3};  // ❌ Error: Cannot infer type from array initializer
```

> ❓ **Why is this invalid?**  
> When using `var` with arrays, you must **explicitly use the `new` keyword**.  
> This gives the compiler a clear indication of the array's **type**, which is required for type inference.

✅ Correct way:

```java
var numbers = new int[]{1, 2, 3};  // ✅ Inferred as int[]
```

#### 🚫 6. Mixing var with compound declarations

```java
var a = 10, b = 20;  // ❌ Error: Cannot declare multiple variables with var
```

> ❓ **Why is this invalid?**  
> Each `var` declaration must be **separate** because **type inference is done per variable**.  
> Java cannot infer types when multiple variables are declared in a single statement using `var`.

✅ Correct Way:

```java
var a = 10;
var b = 20;
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

#### ✅ Good Examples

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

---

### 🎁 Wrapper Classes in Java

Java provides **wrapper classes** to use **primitive data types as objects**. These are especially useful when working with:

- **Collections** (`List`, `Set`, etc.)
- **Generics**
- **Utility methods**
- **Nullable values**

### 🔄 Primitive to Wrapper Mapping

| Primitive | Wrapper     |
|-----------|-------------|
| `byte`    | `Byte`      |
| `short`   | `Short`     |
| `int`     | `Integer`   |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |


### ✅ Why Wrapper Classes?

Wrapper classes are useful in the following scenarios:

- Required for use in **collections** (e.g., `List<Integer>`, `Map<String, Boolean>`)
- Enable use of **`null` values** (primitives can't be null)
- Provide **utility methods** such as:
  - `parseInt()`
  - `compareTo()`
  - `toString()`
  - `valueOf()`

---

### 🔄 Autoboxing and Unboxing

Java automatically converts between **primitive types** and their **corresponding wrapper classes**.

#### 🔹 Autoboxing (Primitive → Wrapper)

The compiler automatically converts a primitive to its wrapper object:

```java
int num = 5;
Integer boxedNum = num;  // Autoboxing
```

#### 🔹 Unboxing (Wrapper → Primitive)

The compiler automatically converts a wrapper object to its primitive type:

```java
Integer obj = 10;
int value = obj;  // Unboxing
```
## ✅ Java Logical Operators & Control Flow Study Notes

This guide covers Java **logical operators** and **control flow statements**, including syntax, short-circuiting, and real-world examples. Perfect for interviews and core syntax practice.

***

## 🔹 Logical Operators in Java

Logical operators are used for:
- Combining conditions (`AND`, `OR`)
- Inverting condition results (`NOT`)
- Efficient decision-making (short-circuiting)

### ⚙️ Operator Summary

| Operator | Meaning         | Example             |
|----------|-----------------|---------------------|
| `&&`     | Logical AND     | `(a > b && b < c)`  |
| `||`     | Logical OR      | `(a > b || b < c)`  |
| `!`      | Logical NOT     | `!(a < b)`          |

***
## 📌 Summary Table: Java Control Statements

| Statement     | Purpose                        | Syntax Example                     |
|---------------|--------------------------------|-------------------------------------|
| `if`          | Executes a block if true       | `if (x > 0) { ... }`                |
| `if-else`     | Two-way conditional logic      | `if (x > y) { ... } else { ... }`   |
| `nested-if`   | Multi-level condition checking | `if (x > 10) { if (y > 5) { ... } }`|
| `if-else-if`  | Multiple condition branches     | `if (...) { ... } else if (...) {}`|
| `switch-case` | Match specific values          | `switch(var) { case 1: ... break; }`|
| `break`       | Exit loop or switch            | `break;`                            |
| `continue`    | Skip current loop iteration    | `continue;`                         |
| `return`      | Exit from method or function   | `return value;`                     |




### ✅ AND Operator (`&&`)

Returns `true` only if **both conditions are true**.

```java
int a = 10;
int b = 20;
int c = 30;

if (c > a && c > b) {
    System.out.println("True");
}
// Output: True

✅ OR Operator(||)
Returns `true` if at least one condition is true.

```java
int a = 10;
int b = 20;
int c = 30;
if (c > a || c < b) {
    System.out.println("True");
}
// Output: True



✅ NOT Operator (!)
Returns the opposite of a condition’s result.

Java

int a = 10;
int b = 20;
System.out.println(!(a < b)); // false
System.out.println(!(a > b)); // true
🚦 Short-Circuiting in Logical Operators
✅ AND Short-Circuit
Java

int a = 10;
int b = 20;
int c = 15;
if ((a > c) && (++b > c)) {
    System.out.println("Inside if block");
}
System.out.println("Value of b: " + b);  // b remains 20
➡️ Second condition not checked because a > c is false.

✅ OR Short-Circuit
Java

int a = 10;
int b = 20;
int c = 15;
if ((a < c) || (++b < c)) {
    System.out.println("Inside if");
}
System.out.println("Value of b: " + b);  // b remains 20
➡️ Second condition skipped because a < c is true.

🔀 Logical Operators with Boolean Values
Java

boolean a = true;
boolean b = false;

System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);     // false
System.out.println(!b);     // true



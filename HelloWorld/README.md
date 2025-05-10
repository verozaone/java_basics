## 🔍 Explanation of Keywords

### `public`
- `public` is an **access modifier**.
- It means the class or method is accessible from **any other class** in the program.

### `static`
- `static` means the method belongs to the **class itself**, not to instances of the class.
- It allows the method to be called **without creating an object**.

### `void`
- `void` specifies that the method **does not return a value**.

### `main`
- `main` is the **entry point** of a standalone Java application.
- The Java Virtual Machine (JVM) calls the `main` method to **start the program**.

### `String[] args`
- This is an **array of strings**.
- It holds **command-line arguments** passed to the program when it is run.
- **Example:** If you run `java HelloWorld test`, then `args[0]` will be `"test"`.

---

## ▶️ How to Compile and Run

Follow these steps to compile and run the program:

### 1. Save the Code
Save the file as `HelloWorld.java`.

### 2. Open Terminal or Command Prompt
Navigate to the directory where the file is saved.

### 3. Compile the Code

```bash
javac HelloWorld.java
```
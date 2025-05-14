1. Declare a primitive `int` variable named `age` and assign the value `25`.
   int age= 25;

2. Declare a primitive `double` variable named `price` and assign the value `19.99`.
   double price= 19.99;

3. Declare a `char` variable with the letter `'A'` and print it.
   char letter = "A";
    System.out.println(letter);

4. Declare a `boolean` variable named `isLoggedIn` and assign it `true`.
    boolean isLoggedIn = true;

5. Declare a `String` variable named `name` and assign it `"Alice"`.
    String name = "Alice";

6. Print the default value of an **instance variable** of type `int`.
    int instantVariable;
     System.out.println(instantVariable);

7. Print the default value of a **static variable** of type `boolean`.
    boolean defaultValue;
     Syetem.out.println(defaultValue);

8. Declare a **local variable** named `message` inside a method and assign `"Hello"`.
    String message = ""Hello;
     System.out.println(message);

9.  Cast a `double` value to an `int` and print the result.
     double cost = 10;
     int costInt = (int) cost;
     Syestem.out.println(costInt);
      

10. Assign an `int` value to a `double` variable (widening) and print it.
     int intValue = 123;
     double doubleValue = intValue;
     System.out.println(doubleValue);
    
11. Create a class with one **instance variable** and one **static variable**. Print both.
    public class Myclass{
        int instanceVar = 10;
        static int staticVar = 20;

    public static void main(String[] args){
        Myclass obj = new Myclass();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Varable: " + Myclass.staticVar);
     }
    }

    
12. Convert a `String` `"123"` to an `int` using `Integer.parseInt()`.
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
    

13. Convert an `int` to a `String` using `String.valueOf()`.
         int number = 456;
         String strNum = String.valueOf(number);
         System.out.println(strNum);
    

14. Create a `Character` object from a `char` and print it.
        char letter = "A";
        Character charObj = new Charctor(letter);
        System.out.println(charObj);

15. Use `Boolean.parseBoolean("true")` and print the result.




16. Demonstrate **autoboxing** by assigning an `int` to an `Integer`.
17. Demonstrate **unboxing** by converting an `Integer` to an `int`.
18. Declare a `float` variable and cast it to an `int`. Print both.
19. Use `Double.valueOf("3.14")` to create a `Double` object and print it.
20. Write a method that takes a `double` parameter and returns it casted to `int`.
    
    


public class LoginCheckConditions {
    public static void main(String[] args) {
        String username = "ad1mi11n";
        String password = "12341";

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful yes");
        } else if (username.equals("admin") && !password.equals("1234")) {
            System.out.println("Password is incorrect");
        } else if (!username.equals("admin") && password.equals("1234")) {
            System.out.println("Username is incorrect");
        } else if (!username.equals("admin") && !password.equals("1234")) {
            System.out.println("Username and Password are incorrect");
        }

        {
            System.out.println("Login Failed");

        }

    }
}
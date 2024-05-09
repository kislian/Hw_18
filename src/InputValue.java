import java.util.Scanner;

public class InputValue {
    public static String inputUserLogin() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите логин=> ");
        return scan.nextLine();
    }

    public static String inputUserPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите пароль=> ");
        return scan.nextLine();
    }

    public static String inputUserConfirmPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Подтвердите пароль=> ");
        return scan.nextLine();
    }
}

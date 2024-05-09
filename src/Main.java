import exception.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String currentLogin = InputValue.inputUserLogin();
        String currentPassword = InputValue.inputUserPassword();
        String confirmPassword = InputValue.inputUserConfirmPassword();
        try {
            LoginPasswordValidator.validateLoginPassword(currentLogin, currentPassword, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Строка Логина может содержать только латинские буквы, цифры и знак подчеркивания");
        } catch (WrongPasswordException e) {
            System.out.println("Строка Пароля может содержать только латинские буквы, цифры и знак подчеркивания");
        } catch (WrongConfirmPasswordException e) {
            System.out.println("Пароли не совпадают");
        } catch (WrongLengthPasswordException | WrongLengthLoginException e) {
            System.out.println("Длина пароля или логина больше 20 символов");
        } finally {
            System.out.println("Проверка завершена");
        }

    }
}
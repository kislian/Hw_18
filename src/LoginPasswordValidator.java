import exception.*;

public class LoginPasswordValidator {

    public static void validateLoginPassword(String login, String password, String repeatPassword)
            throws WrongConfirmPasswordException, WrongLoginException, WrongPasswordException, WrongLengthLoginException, WrongLengthPasswordException {
        boolean loginLength = login.length() <= 20;
        boolean loginMatch = login.matches("[a-zA-Z0-9_]+");
        boolean passwordLength = password.length() <= 20;
        boolean passwordMatch = password.matches("[a-zA-Z0-9_]+");
        boolean passwordConfirmed = password.equals(repeatPassword);

        if (!loginLength) {
            throw new WrongLengthLoginException();
        }
        if (!loginMatch) {
            throw new WrongLoginException();
        }
        if (!passwordLength) {
            throw new WrongLengthPasswordException();
        }
        if (!passwordMatch) {
            throw new WrongPasswordException();
        }
        if (!password.equals(repeatPassword)) {
            throw new WrongConfirmPasswordException();
        }

    }
}
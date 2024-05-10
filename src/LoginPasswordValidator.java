import exception.*;

public class LoginPasswordValidator {

    public static void validateLoginPassword(String login, String password, String repeatPassword)


            throws WrongConfirmPasswordException, WrongLoginException, WrongPasswordException, WrongLengthLoginException, WrongLengthPasswordException {
          final String PATTERN = "[a-zA-Z0-9_]+";
         final int MAX_LENGTH = 20;
        boolean loginLength = login.length() <= MAX_LENGTH;
        boolean loginMatch = login.matches(PATTERN);
        boolean passwordLength = password.length() <= MAX_LENGTH;
        boolean passwordMatch = password.matches(PATTERN);
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
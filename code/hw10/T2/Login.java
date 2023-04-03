package code.hw10.T2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    private final String login;
    private final String password;
    private final String confirmPassword;

    public Login (String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void checkLogin () throws WrongLoginException {
        boolean check;
        check = (login.length() < 20) && !(login.contains(" "));

        if (!check) throw new WrongLoginException();
    }

    public void checkPassword () throws WrongPasswordException {
        boolean check;
        String regex = "\\d+";
        /*Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);*/
        check = (password.length() < 20) &&
                !(password.contains(" ")) &&
                (password.equals(confirmPassword)) &&
                password.matches(regex);

        if (!check) throw new WrongPasswordException();
    }
}

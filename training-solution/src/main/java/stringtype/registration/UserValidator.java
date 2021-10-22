package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username){
        return !"".equals(username);
    }
    public boolean isValidPassword(String password1, String password2){
        return (password1.equals(password2)) && (password1.length() >= 8);
    }

    public boolean isValidEmail(String email){
        int atIndex = email.indexOf("@");
        String mailDomain = email.substring(atIndex+1);
        int dotIndex = mailDomain.indexOf(".");
        return atIndex >0 && dotIndex>0 && dotIndex < mailDomain.length()-1;

    }
}

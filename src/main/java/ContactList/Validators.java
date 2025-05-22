package ContactList;

public class Validators {
    public static boolean isNameValid(String name) {
        // Return false if name is null
        if (name == null){
            return false;
        }
        // Return false if name  is empty and have only space
        if(name.trim().isEmpty()){
            return false;
        }
        // Return false if name have less two characters
        if (name.length() < 2) {
            return false;
        }

        return true;

    }
    public  static boolean isEmailValid(String email) {
        //Return false is email is null.
        if (email == null){
            return false;
        }
        //Return false if email is empty and have only space
        if (email.trim().isEmpty()){
            return false;
        }
        // Email need contains "@"
        if (!email.contains("@")){
            return false;
        }
        //Email need contains "."
        if (!email.contains(".")){
            return false;
        }
        // Email need have more much 5 characters
        if (email.length() < 5 ){
            return false;
        }
        return true;
    }
    public static boolean isNumberValid(String number){
        if (!number.contains("+373")){
            return false;
        }
        return true;
    }

}


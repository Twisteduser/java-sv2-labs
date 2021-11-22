package introexceptionthrow;

public class Validation {
    public void validateName(String name){
        if (name.equals(null) | name.equals("")){
            throw new IllegalArgumentException("Hibás név!");
        }
    }
    public void validateAge(String ageString){
        if (ageString.equals("")){
            throw new IllegalArgumentException("Életkor nem lehet üres");
        }

        char[] chars = ageString.toCharArray();
        for (char c : chars){
            if (!Character.isDigit(c)){
                throw new IllegalArgumentException("Nem számot adott meg!");
            }
        }
        int age = Integer.parseInt(ageString);
        if (age>120){
            throw new IllegalArgumentException("Nem érvényes életkor");
        }

    }
}

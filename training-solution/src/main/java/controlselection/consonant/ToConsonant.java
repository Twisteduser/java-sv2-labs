package controlselection.consonant;

public class ToConsonant {
    public char nextCorrectLetter(char c){
        String vowels = "aeuioAEUIO";
        if (vowels.indexOf(c)>=0){
            return (char)(c+1);
        }
        else {
            return c;
        }

    }
}

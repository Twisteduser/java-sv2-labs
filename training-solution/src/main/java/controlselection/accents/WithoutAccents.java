package controlselection.accents;

public class WithoutAccents {
    public static final String LETTERS_WITH_ACCENTS = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";

    public static final String LETTERS_WITHOUT_ACCENTS = "aeiooouuuAEIOOOUUU";

    public char charConverter(char c){
        int indexOfLetter = LETTERS_WITH_ACCENTS.indexOf(c);
        if (indexOfLetter>=0){
            return LETTERS_WITHOUT_ACCENTS.charAt(indexOfLetter);
        }
        else {
            return c;
        }
    }
}

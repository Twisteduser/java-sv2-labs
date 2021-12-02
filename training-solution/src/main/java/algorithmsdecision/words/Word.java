package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String word){
        boolean contains = false;
        for (String w : words){
            if (w.length()>word.length()){
                return true;
            }
        }
        return contains;
    }
}

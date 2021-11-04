package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word){
        words.add(word);
    }

    void getWordsStartWith(String prefix){
        List<String> wordsToDel = new ArrayList<>();
        for (String s : words){
            if (!s.startsWith(prefix)){
                wordsToDel.add(s);
            }
        }
        words.removeAll(wordsToDel);
    }

    void getWordsWithLength(int length){
        List<String> wordsToDel = new ArrayList<>();
        for (String s: words){
            if (s.length() != length){
                wordsToDel.add(s);
            }
        }
        words.removeAll(wordsToDel);
    }
}

package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{
    private String title;
    private int length;
    private List<String> composer = new ArrayList<>();
    private List<String> performers = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
        if (!validate()){
            throw new IllegalArgumentException();
        }
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        this.title = title;
        this.length = length;
        this.performers = performers;
        if (!validate()){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < performers.size()){
            if (!getComposer().isEmpty()){
                result.add(getComposer().get(i));
            }
            result.add(getPerformers().get(i));
            i++;
        }
        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getComposer() {
        return composer;
    }

    public List<String> getPerformers() {
        return performers;
    }

    private boolean validate(){
        if (title == null || title.isEmpty()){
            return false;
        }
        if (length < 0){
            return false;
        }
        if (getPerformers().isEmpty()){
            return false;
        }
        return true;
    }
}


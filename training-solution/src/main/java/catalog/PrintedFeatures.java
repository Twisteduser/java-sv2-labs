package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private List<String> authors = new ArrayList<>();
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
        if (!validate()){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private boolean validate(){
        if (title == null || title.isEmpty()){
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages < 0){
            return false;
        }
        if (authors==null){
            return false;
        }
        return true;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

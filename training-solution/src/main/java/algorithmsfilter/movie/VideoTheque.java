package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovies(Movie movie){
        movies.add(movie);
    }

    public List<Movie> categoryFilteredMovies(Category category){
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie m: movies){
            if (m.getCategory().equals(category) && m.getRating()>3){
                filteredMovies.add(m);
            }
        }
        return filteredMovies;
    }
}

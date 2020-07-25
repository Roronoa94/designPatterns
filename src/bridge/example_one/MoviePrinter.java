package bridge.example_one;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Runtime", movie.getRuntime()));
        details.add(new Detail("Cast", movie.getActor()));

        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}

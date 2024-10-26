package composite;

import java.util.List;

public class Pack implements Media {

    private List<Movie> movies;
    private List<Serie> series;

    public Pack(List<Movie> movies, List<Serie> series) {
        this.movies = movies;
        this.series = series;
    }

    @Override
    public Long getDuration() {
        Long moviesDuration = movies.stream().mapToLong(value -> value.getDuration()).sum();
        Long seriesDuration = series.stream().mapToLong(value -> value.getDuration()).sum();

        return seriesDuration + moviesDuration;
    }

}
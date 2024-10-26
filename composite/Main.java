package composite;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie(120L);

        Episode episode1 = new Episode(40L);
        Episode episode2 = new Episode(42L);
        Episode episode3 = new Episode(38L);

        // Create a season and add episodes
        Season season1 = new Season();
        season1.addEpisode(episode1);
        season1.addEpisode(episode2);
        season1.addEpisode(episode3);

        // Create a series and add seasons
        Serie series = new Serie();
        series.addSeason(season1);

        Pack pack = new Pack(List.of(movie), List.of(series));

        // Calculate total duration of the series
        System.out.println("Total duration of series: " + pack.getDuration() + " minutes");
    }
}

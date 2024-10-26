package composite;

import java.util.ArrayList;
import java.util.List;

public class Serie implements Media {

    private List<Season> seasonList = new ArrayList<>();

    public Serie() {
    }

    public void addSeason(Season season) {
        seasonList.add(season);
    }


    @Override
    public Long getDuration() {
        return seasonList
                .stream()
                .mapToLong(season -> season.getEpisodes().stream().mapToLong(Media::getDuration).sum())
                .sum();
    }

}
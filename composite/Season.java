package composite;

import java.util.ArrayList;
import java.util.List;

public class Season implements Media {

    private List<Episode> episodes = new ArrayList<>();

    public Season() {
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    @Override
    public Long getDuration() {
        return episodes.stream().mapToLong(Media::getDuration).sum();
    }

}
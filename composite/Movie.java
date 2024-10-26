package composite;

public class Movie implements Media {

    private Long duration;

    public Movie(Long duration) {
        this.duration = duration;
    }

    @Override
    public Long getDuration() {
        return this.duration;
    }

}

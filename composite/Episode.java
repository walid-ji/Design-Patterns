package composite;

public class Episode implements Media {

    private Long duration;

    public Episode(Long duration) {
        this.duration = duration;
    }


    @Override
    public Long getDuration() {
        return this.duration;
    }

}

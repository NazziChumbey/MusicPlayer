package ua.spring.musicPlayer.model;
import java.util.List;

public class Singer {
    private String name;
    private int yearBirthday;
    private List<Genre> genres;
    private List<Music> musics;

    public Singer() {
    }

    public Singer(String name, List<Music> musics) {
        this.name = name;
        this.musics = musics;
    }

    public Singer(String name, int yearBirthday, List<Genre> genres, List<Music> musics) {
        this.name = name;
        this.yearBirthday = yearBirthday;
        this.genres = genres;
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public Singer setName(String name) {
        this.name = name;
        return this;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public Singer setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
        return this;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Singer setGenres(List<Genre> genres) {
        this.genres = genres;
        return this;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public Singer setMusics(List<Music> musics) {
        this.musics = musics;
        return this;
    }
}

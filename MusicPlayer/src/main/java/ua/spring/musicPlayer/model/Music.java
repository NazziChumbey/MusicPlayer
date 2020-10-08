package ua.spring.musicPlayer.model;

public class Music {
    private String name;
    private int yearRelease;
    private String lyrics;
    private Genre genre;
    private Singer singer;

    public Music() {
    }

    public Music(String name, Singer singer, Genre genre) {
        this.name = name;
        this.singer = singer;
        this.genre = genre;
    }

    public Music(String name, int yearRelease, String lyrics, Genre genre, Singer singer) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.lyrics = lyrics;
        this.genre = genre;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public Music setName(String name) {
        this.name = name;
        return this;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public Music setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
        return this;
    }

    public String getLyrics() {
        return lyrics;
    }

    public Music setLyrics(String lyrics) {
        this.lyrics = lyrics;
        return this;
    }

    public Genre getGenre() {
        return genre;
    }

    public Music setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public Singer getSinger() {
        return singer;
    }

    public Music setSinger(Singer singer) {
        this.singer = singer;
        return this;
    }
}

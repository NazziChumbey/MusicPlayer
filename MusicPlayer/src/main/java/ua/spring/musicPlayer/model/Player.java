package ua.spring.musicPlayer.model;

public class Player {
    private double volume;

    public double getVolume() {
        return volume;
    }

    public Player setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public Player(double volume) {
        this.volume = volume;
    }
}

package com.rho.series.bean;

public class Serie {
    private String name;
    private int seasons;
    private boolean netflixOriginal;

    public Serie(String name, int seasons, boolean netflixOriginal) {
        this.name = name;
        this.seasons = seasons;
        this.netflixOriginal = netflixOriginal;
    }

    public String getName() {
        return name;
    }

    public int getSeasons() {
        return seasons;
    }

    public boolean isNetflixOriginal() {
        return netflixOriginal;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "name='" + name + '\'' +
                ", seasons=" + seasons +
                ", netflixOriginal=" + netflixOriginal +
                '}';
    }
}

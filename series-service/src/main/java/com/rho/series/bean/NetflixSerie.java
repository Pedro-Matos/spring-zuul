package com.rho.series.bean;

public class NetflixSerie {
    private String name;
    private int seasons;
    private boolean netflixOriginal;

    public NetflixSerie(String name, int seasons, boolean netflixOriginal) {
        this.name = name;
        this.seasons = seasons;
        this.netflixOriginal = netflixOriginal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isNetflixOriginal() {
        return netflixOriginal;
    }

    public void setNetflixOriginal(boolean netflixOriginal) {
        this.netflixOriginal = netflixOriginal;
    }

    @Override
    public String toString() {
        return "NetflixSerie{" +
                "name='" + name + '\'' +
                ", seasons=" + seasons +
                ", netflixOriginal=" + netflixOriginal +
                '}';
    }
}

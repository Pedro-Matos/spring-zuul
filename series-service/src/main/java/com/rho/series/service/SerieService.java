package com.rho.series.service;

import com.rho.series.bean.Serie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SerieService implements ISerieService {
    private final static List<Serie> userContent = new ArrayList();

    static {
        Serie serie1 = new Serie("Stranger Things", 3, true);
        Serie serie2 = new Serie("Peaky Blinders", 5, false);
        Serie serie3 = new Serie("Love, Death and Robots", 1, true);

        userContent.add(serie1);
        userContent.add(serie2);
        userContent.add(serie3);
    }

    @Override
    public List<Serie> displayUserContent() {
        return userContent;
    }
}

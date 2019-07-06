package com.rho.series.service;

import com.rho.series.bean.NetflixSerie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SerieService implements ISerieService {
    private final static List<NetflixSerie> userContent = new ArrayList();

    static {
        NetflixSerie serie1 = new NetflixSerie("Stranger Things", 3, true);
        NetflixSerie serie2 = new NetflixSerie("Peaky Blinders", 5, false);
        NetflixSerie serie3 = new NetflixSerie("Love, Death and Robots", 1, true);

        userContent.add(serie1);
        userContent.add(serie2);
        userContent.add(serie3);
    }

    @Override
    public List<NetflixSerie> displayUserContent() {
        return userContent;
    }
}

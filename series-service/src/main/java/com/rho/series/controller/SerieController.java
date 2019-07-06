package com.rho.series.controller;

import com.rho.series.service.ISerieService;
import com.rho.series.bean.NetflixSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class SerieController {
    @Autowired
    private ISerieService serieService;

    @GetMapping("/")
    public List<NetflixSerie> getBook() {
        List<NetflixSerie> series = serieService.displayUserContent();
        return series;
    }
}

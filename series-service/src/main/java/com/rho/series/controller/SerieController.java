package com.rho.series.controller;

import com.rho.series.bean.Serie;
import com.rho.series.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SerieController {
    private final static String SERIES_VARIABLE = "series";
    private static final String SERIES_PAGE = "table";

    @Autowired
    private ISerieService serieService;

    @GetMapping(value = "/")
    public String getSerie(Model model){
        List<Serie> shows = serieService.displayUserContent();
        model.addAttribute(SERIES_VARIABLE, shows);
        return SERIES_PAGE;
    }
}


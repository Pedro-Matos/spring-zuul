package com.rho.series.controller;

import com.rho.series.bean.Serie;
import com.rho.series.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class SerieController {
    private final static String BOOKS_VARIABLE = "series";
    private static final String BOOKS_PAGE = "table";

    @Autowired
    private ISerieService serieService;

    @GetMapping(value = "/")
    public String getSerie(Model model){
        List<Serie> shows = serieService.displayUserContent();
        model.addAttribute("series", shows);
        System.out.println(Arrays.toString(shows.toArray()));
        System.out.println(model.toString());
        return "table";
    }
}


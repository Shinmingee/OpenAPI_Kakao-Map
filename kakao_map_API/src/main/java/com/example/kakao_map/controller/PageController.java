package com.example.kakao_map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/showMap")
    public String showMap(Model model){
            return "showMap";
    }

    @RequestMapping("/sizeMap")
    public String sizeMap(Model model){
        return "dynamicMap";
    }

}

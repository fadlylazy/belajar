package com.belajar1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andi on 11/1/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "mahasiswa";
    }
}



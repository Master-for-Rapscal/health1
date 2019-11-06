package com.aaa.health.controller.hyper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hy")
public class HyController {

    @RequestMapping("/list")
    public String geHy(){
        return "hy/list";
    }
}

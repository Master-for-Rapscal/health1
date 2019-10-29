package com.aaa.health.controller.tangniaon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tangniao")
public class TangNiaoController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String goTang(){
        return "tang/list";
    }
}

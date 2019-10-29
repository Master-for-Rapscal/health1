package com.aaa.health.controller.othslow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/othslowMEC")
public class OthSlowMECController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String zili(){
        return "othslowMEC/list";
    }
}

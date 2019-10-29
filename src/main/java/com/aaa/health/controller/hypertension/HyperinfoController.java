package com.aaa.health.controller.hypertension;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hyperinfo")
public class HyperinfoController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String goHyper(){
        return "hyperinfo/list";
    }
}

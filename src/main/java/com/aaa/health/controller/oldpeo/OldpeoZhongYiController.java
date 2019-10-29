package com.aaa.health.controller.oldpeo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/OldpeoZhongYi")
public class OldpeoZhongYiController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String zili(){
        return "OldpeoZhongYi/list";
    }
}

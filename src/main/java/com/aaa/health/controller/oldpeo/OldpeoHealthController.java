package com.aaa.health.controller.oldpeo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;
@Controller
@RequestMapping("/oldpeohealth")

public class OldpeoHealthController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String zili(){
        return "oldpeohealth/list";
    }
}


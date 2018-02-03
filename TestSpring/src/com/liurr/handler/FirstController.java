package com.liurr.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("first")
public class FirstController {
    @RequestMapping("/infoSearch")
    public String infoSearch(){
        return "first";
    }
    
}

package dev.a2021.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {
    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "Hello World!";
    }
}
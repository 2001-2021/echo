package dev.a2021.sb.ctr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {
    @RequestMapping("/hw")
    @ResponseBody
    public String test(){
        return "Hello World!";
    }
}
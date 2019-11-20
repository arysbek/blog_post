package com.blog.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String home() {
        return "Welcome Home";
    }


}

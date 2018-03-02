package com.mark.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Cre
 * ated by marklovatt on 02/03/2018.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/"})
    public String getIndexPage() {
        System.out.println("Some message to say ......ABC123 ");
        return "index";
    }
}

package com.whd.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("")
    public String homeView() {
        return "home";
    }

    @GetMapping("/about")
    public String aboutView() {
        return "about";
    }
}

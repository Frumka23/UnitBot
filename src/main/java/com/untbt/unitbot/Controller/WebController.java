package com.untbt.unitbot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping
@Controller
public class WebController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start() {
        return "login";
    }

    //@RequestMapping(value = "/login", method = RequestMethod.GET)
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginError", false);
        return "login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}

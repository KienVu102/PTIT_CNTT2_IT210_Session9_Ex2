package org.example.session9_ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage(
            @CookieValue(value = "guest_name", defaultValue = "Khách lạ") String guestName,
            Model model) {

        String message = guestName.equals("Khách lạ") ? "Chào khách lạ!" : "Chào mừng " + guestName + " trở lại!";
        model.addAttribute("msg", message);

        return "home-page";
    }
}
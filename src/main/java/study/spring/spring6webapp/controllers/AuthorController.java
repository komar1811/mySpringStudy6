package study.spring.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import study.spring.spring6webapp.services.AuthorService;

@Controller
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService)
    {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("randevu", authorService.findAll());

        return "authors";
    }
}

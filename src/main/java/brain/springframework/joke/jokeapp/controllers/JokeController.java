package brain.springframework.joke.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import brain.springframework.joke.jokeapp.services.JokeService;
import org.springframework.web.bind.annotation.RestController;

@Controller //we annotate it as a controller that it really is(mvc)
public class JokeController {

    private JokeService jokeService; //We reference the whole JokeService interface as an object

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""}) //This gonna map out the context root for us and also show the joke
    public String showJoke(Model model){ //We want to add an attribute that pass in the instance of the model

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";

    }
}

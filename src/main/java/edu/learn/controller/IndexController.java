package edu.learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kash on 5/19/16.
 */
@Controller
public class IndexController {
    int counter = 0;
    String VIEW_INDEX = "index";
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {

        model.addAttribute("message", "Welcome");
        model.addAttribute("counter", ++counter);
        logger.debug("[welcome] counter : {}", counter);

        return VIEW_INDEX;

    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable String name, ModelMap model) {

        model.addAttribute("message", "Welcome " + name);
        model.addAttribute("counter", ++counter);
        logger.debug("[welcomeName] counter : {}", counter);
        return VIEW_INDEX;

    }

}

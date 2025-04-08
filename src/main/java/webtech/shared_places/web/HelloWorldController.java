package webtech.shared_places.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping (path="/")
    public ModelAndView showHelloWorldPage(){
        return new ModelAndView showHelloWorldPage("Hello World");

        //kok gabisa muncul di https?
    }


}

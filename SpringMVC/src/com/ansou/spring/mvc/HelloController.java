package com.ansou.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {

    //need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showFrom() {
        return "helloworld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processFrom")
    public String processForm() {
        return "helloworld";
    }

    //new controller method to read data from the model
    //add data to model
    @RequestMapping("/processFromVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        //read the request parameter from request
        String theName = request.getParameter("studentName");
        //convert the data
        theName = theName.toUpperCase();
        //create the message
        theName = "Yo! " + theName;
        //add message to model
        model.addAttribute("message", theName);

        return "helloworld";
    }

    //new controller method to read data from the model
    //add data to model
    @RequestMapping("/processFromVersionThree")
    public String processFromVersionThree(@RequestParam("studentName")String theName, Model model){
        //add message to model
        model.addAttribute("message", "Hey buddy! " + theName.toUpperCase());

        return "helloworld";
    }

}

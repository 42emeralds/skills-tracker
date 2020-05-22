package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String possibleLanguages() {
        return "<html>" +
                "<body>" +
                    "<h1>Skills Tracker</h2>" +
                    "<h2>We have a few skills we would like to learn, Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>Swift</li>" +
                        "<li>JavaScript</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languageForm() {
        return "<html>" +
                "<body>" +
                    "<form method='post' action='/languages'>" +
                    "<h2>Name:</h2>" +
                    "<input type = 'text' name = 'name' />" +
                    "<h2>My favorite language:</h2>" +
                        "<select id='firstChoice' name = 'firstChoice'>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>JavaScript</option>" +
                            "<option value='swift'>Swift</option>" +
                        "</select>" +
                    "<h2>My Second favorite language:</h2>" +
                        "<select id='secondChoice' name='secondChoice'>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>JavaScript</option>" +
                            "<option value='swift'>Swift</option>" +
                        "</select>" +
                    "<h2>My Third favorite language:</h2>" +
                        "<select id='thirdChoice' name = 'thirdChoice'>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>JavaScript</option>" +
                            "<option value='swift'>Swift</option>" +
                        "</select>" +
                    "<br><input type = 'submit' value = 'Submit'/>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("languages")
    public String hello(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                            "<table>" +
                            "<tr>" +
                                "<th>First Choice</th>" +
                                "<th>Second Choice</th>" +
                                "<th>Third Choice</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>" + firstChoice + "</td>" +
                                "<td>" + secondChoice + "</td>" +
                                "<td>" + thirdChoice + "</td>" +
                            "</tr>" +
                            "</table>" +
                    "</body>" +
                "</html>";
    }
}

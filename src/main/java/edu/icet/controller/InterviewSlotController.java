package edu.icet.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/slot")
@CrossOrigin
public class InterviewSlotController {


    @GetMapping
    public String load(){
        return "Slot Loaded..";
    }

}

package edu.icet.controller;

import edu.icet.model.dto.InterviewSlotDTO;
import edu.icet.service.InterviewSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/slot")
@CrossOrigin
public class InterviewSlotController {

    @Autowired
    InterviewSlotService interviewSlotService;


    @GetMapping
    public String load(){
        return "Slot Loaded..";
    }

    @GetMapping("/getAll")
    public List<InterviewSlotDTO> getAllSlots() {
        return interviewSlotService.getAllSlots();
    }


}

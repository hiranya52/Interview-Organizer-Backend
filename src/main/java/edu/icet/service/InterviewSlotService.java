package edu.icet.service;

import edu.icet.mapper.InterviewSlotMapper;
import edu.icet.model.dto.InterviewSlotDTO;
import edu.icet.model.entity.InterviewSlot;
import edu.icet.repository.InterviewSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InterviewSlotService {

    @Autowired
    InterviewSlotRepository interviewSlotRepository;

    public List<InterviewSlotDTO> getAllSlots() {

        List<InterviewSlot> slots = interviewSlotRepository.findAll();

        List<InterviewSlotDTO> slotDTOs = new ArrayList<>();

        for (InterviewSlot slot : slots) {
            InterviewSlotDTO dto = InterviewSlotMapper.toDTO(slot);
            slotDTOs.add(dto);
        }
        return slotDTOs;
    }
}

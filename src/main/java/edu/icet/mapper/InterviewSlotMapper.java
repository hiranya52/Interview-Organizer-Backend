package edu.icet.mapper;

import edu.icet.model.dto.BookingDTO;
import edu.icet.model.dto.InterviewSlotDTO;
import edu.icet.model.entity.Booking;
import edu.icet.model.entity.InterviewSlot;

public class InterviewSlotMapper {

    public static InterviewSlotDTO toDTO(InterviewSlot slot) {
        if (slot == null) return null;

        return InterviewSlotDTO.builder()
                .time(slot.getTime())
                .slotType(slot.getSlotType())
                .booking(slot.getBooking() != null ?
                        BookingDTO.builder()
                                .title(slot.getBooking().getTitle())
                                .candidate(slot.getBooking().getCandidate())
                                .interviewer(slot.getBooking().getInterviewer())
                                .build()
                        : null)
                .build();
    }

    public static InterviewSlot toEntity(InterviewSlotDTO dto) {
        if (dto == null) return null;

        return InterviewSlot.builder()
                .time(dto.getTime())
                .slotType(dto.getSlotType())
                .booking(dto.getBooking() != null ?
                        Booking.builder()
                                .title(dto.getBooking().getTitle())
                                .candidate(dto.getBooking().getCandidate())
                                .interviewer(dto.getBooking().getInterviewer())
                                .build()
                        : null)
                .build();
    }

}

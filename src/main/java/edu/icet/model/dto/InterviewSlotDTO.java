package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class InterviewSlotDTO {

    private String time;
    private SlotType slotType;
    private BookingDTO booking;

    public enum SlotType {
        AVAILABLE,
        BOOKED,
        CONFLICT
    }

}

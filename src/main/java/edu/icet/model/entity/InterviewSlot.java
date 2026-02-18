package edu.icet.model.entity;

import edu.icet.model.dto.InterviewSlotDTO;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class InterviewSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String time; // e.g., "09:00 AM"

    @Enumerated(EnumType.STRING)
    private InterviewSlotDTO.SlotType slotType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
    private Booking booking;

}

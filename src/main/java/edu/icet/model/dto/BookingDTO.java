package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BookingDTO {

    private String title;
    private String candidate;
    private String interviewer;

}

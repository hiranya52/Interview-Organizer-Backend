package edu.icet.model.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CandidateDTO {

    private String name;
    private String email;
    private String phoneNo;
    private String job;

    private MultipartFile cv;

}

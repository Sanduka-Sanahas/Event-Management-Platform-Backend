package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organizer {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
}

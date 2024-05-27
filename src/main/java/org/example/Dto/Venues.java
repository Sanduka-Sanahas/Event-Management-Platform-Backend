package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venues {

    private Long id;
    private String name;
    private String address;
    private String capacity;
    private String phoneNumber;
}

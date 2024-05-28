package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {

    private Long id;
    private Date date;
    private String status;
    private Integer eventId;
    private Integer attendeeId;
}

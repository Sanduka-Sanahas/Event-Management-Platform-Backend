package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {

    private Long id;
    private String sessionName;
    private String startTime;
    private String endTime;
    private String description;
    private Integer eventId;

}

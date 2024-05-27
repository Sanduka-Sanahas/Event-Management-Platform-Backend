package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    private Long id;
    private String type;
    private double price;
    private int quantity;
    private Date startDate;
    private String endDate;
}

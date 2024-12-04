package edu.icet.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class RentalItem {
    @Id
    private Integer rentalItemId;
    private Integer rentalId;
    private Integer itemId;
    private Integer quantity;
}

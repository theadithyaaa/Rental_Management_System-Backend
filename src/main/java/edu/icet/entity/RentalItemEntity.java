package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "rental_item")
public class RentalItemEntity {
    @Id
    private Integer rentalItemId;

    @ManyToOne
    private RentalEntity rental;

    @ManyToOne
    private ItemEntity item;

    private Integer quantity;
}

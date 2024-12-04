package edu.icet.controller;

import edu.icet.dto.RentalItem;
import edu.icet.service.RentalItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental-items")
public class RentalItemController {

    @Autowired
    private RentalItemService rentalItemService;

    @PostMapping
    public RentalItem addRentalItem(@RequestBody RentalItem rentalItemDTO) {
        return rentalItemService.addRentalItem(rentalItemDTO);
    }

    @GetMapping("/rental/{rentalId}")
    public List<RentalItem> getRentalItemsByRentalId(@PathVariable Integer rentalId) {
        return rentalItemService.getRentalItemsByRentalId(rentalId);
    }
}

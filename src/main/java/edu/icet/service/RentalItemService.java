package edu.icet.service;

import edu.icet.dto.RentalItem;
import java.util.List;

public interface RentalItemService {

    RentalItem addRentalItem(RentalItem rentalItem);

    List<RentalItem> getRentalItemsByRentalId(Integer rentalId);

    void removeRentalItem(Integer rentalItemId);
}

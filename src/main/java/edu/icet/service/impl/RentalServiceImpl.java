package edu.icet.service.impl;

import edu.icet.dto.Rental;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RentalServiceImpl implements RentalService {
    @Override
    public List<Rental> getAll() {
        return List.of();
    }

    @Override
    public void addRental(Rental rental) {

    }

    @Override
    public void deleteRentaltyById(Integer id) {

    }

    @Override
    public Rental searchRentalById(Integer id) {
        return null;
    }

    @Override
    public void updateRentalById(Rental rental) {

    }
}

package edu.icet.service.impl;

import edu.icet.dto.Rental;
import edu.icet.entity.RentalEntity;
import edu.icet.repository.RentalRepository;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RentalServiceImpl implements RentalService {

    private final RentalRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Rental> getAll() {
        List<Rental> rentalArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            rentalArrayList.add(mapper.map(entity, Rental.class));
        });
        return rentalArrayList;
    }

    @Override
    public void addRental(Rental rental) {
        System.out.println(rental);
        repository.save(mapper.map(rental, RentalEntity.class));

    }

    @Override
    public void deleteRentaltyById(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public Rental searchRentalById(Integer id) {
        return mapper.map(repository.findById(id),Rental.class);
    }

    @Override
    public void updateRentalById(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));

    }
}

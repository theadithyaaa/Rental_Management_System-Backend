package edu.icet.repository;

import edu.icet.entity.RentalItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalItemRepository extends JpaRepository<RentalItemEntity, Integer> {

}

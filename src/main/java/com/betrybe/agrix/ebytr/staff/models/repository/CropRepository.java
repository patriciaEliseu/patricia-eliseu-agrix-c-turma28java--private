package com.betrybe.agrix.ebytr.staff.models.repository;

import com.betrybe.agrix.ebytr.staff.models.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * interface.
 */


@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
}

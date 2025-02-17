package com.betrybe.agrix.ebytr.staff.service;


import com.betrybe.agrix.ebytr.staff.models.entity.Fertilizer;
import com.betrybe.agrix.ebytr.staff.models.repository.CropRepository;
import com.betrybe.agrix.ebytr.staff.models.repository.FertilizerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * class.
 */

@Service
public class FertilizerService {
  private final FertilizerRepository fertilizerRepository;
  private final CropRepository cropRepository;

  @Autowired
  public FertilizerService(
      FertilizerRepository fertilizerRepository,
      CropRepository cropRepository
  ) {
    this.fertilizerRepository = fertilizerRepository;
    this.cropRepository = cropRepository;
  }


  public Fertilizer insertFertilizer(Fertilizer fertilizer) {
    return fertilizerRepository.save(fertilizer);
  }

  public List<Fertilizer> getAllFertilizer() {
    return fertilizerRepository.findAll();
  }

  public Optional<Fertilizer> getFertilizerById(Long id) {
    return fertilizerRepository.findById(id);
  }

}

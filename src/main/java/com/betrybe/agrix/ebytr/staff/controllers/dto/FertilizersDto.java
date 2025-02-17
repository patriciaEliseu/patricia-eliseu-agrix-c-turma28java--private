package com.betrybe.agrix.ebytr.staff.controllers.dto;


import com.betrybe.agrix.ebytr.staff.models.entity.Fertilizer;
/**
 * record.
 */


public record FertilizersDto(
    Long id,
    String name,
    String brand,
    String composition) {


  /**
   * constructor.
   */


  public Fertilizer toFertilizer() {
    return new Fertilizer(id, name, brand, composition, null);
  }


  /**
   * constructor static.
   */

  public static FertilizersDto fertilizersDto(Fertilizer fertilizer) {
    return new FertilizersDto(
        fertilizer.getId(),
        fertilizer.getName(),
        fertilizer.getBrand(),
        fertilizer.getComposition()
    );
  }

  /**
   * Método.
   */

  public static FertilizersDto toDto(Fertilizer fertilizer) {
    return new FertilizersDto(
        fertilizer.getId(),
        fertilizer.getName(),
        fertilizer.getBrand(),
        fertilizer.getComposition()
    );
  }
}



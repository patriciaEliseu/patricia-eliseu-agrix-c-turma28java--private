package com.betrybe.agrix.ebytr.staff.models.entity;


import com.betrybe.agrix.ebytr.staff.models.entity.Crop;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;


/**
 * class fertilizer.
 */

@Entity
@Table(name = "fertilizer")
public class Fertilizer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String brand;
  private String composition;
  @ManyToMany(mappedBy = "fertilizers")
  @JsonIgnore
  private List<Crop> crops;


  /**
   * constructor.
   */


  public Fertilizer() {

  }


  /**
   * constructor.
   */


  public Fertilizer(Long id, String name, String brand, String composition, List<Crop> crops) {
    this.id = id;
    this.name = name;
    this.brand = brand;
    this.composition = composition;
    this.crops = crops;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getComposition() {
    return composition;
  }

  public void setComposition(String composition) {
    this.composition = composition;
  }

  public List<Crop> getCrops() {
    return crops;
  }

  public void setCrops(List<Crop> crops) {
    this.crops = crops;
  }


}

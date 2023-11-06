package com.betrybe.agrix.ebytr.staff.controllers.dto;


import com.betrybe.agrix.ebytr.staff.models.entity.Person;
import com.betrybe.agrix.ebytr.staff.security.Role;
/**
 * record.
 */


public record PersonDto(
    Long id,
    String username,
    String password,
    Role role
) {


  public Person toPerson() {
    return new Person(id, username, role);
  }


}

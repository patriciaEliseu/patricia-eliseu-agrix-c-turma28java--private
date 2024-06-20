package com.betrybe.agrix.ebytr.staff.controllers;


import com.betrybe.agrix.ebytr.staff.controllers.dto.PersonDto;
import com.betrybe.agrix.ebytr.staff.controllers.dto.PersonResponseDto;
import com.betrybe.agrix.ebytr.staff.controllers.dto.ResponseDto;
import com.betrybe.agrix.ebytr.staff.models.entity.Person;
import com.betrybe.agrix.ebytr.staff.service.PersonService;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Class.
 */


@RestController
@RequestMapping("/persons")
public class PersonsController {
  private PersonService personService;

  @Autowired
  public PersonsController(PersonService personService) {
    this.personService = personService;
  }

  /**
   * PostPersons.
   */


  @PostMapping()
  public ResponseEntity<PersonResponseDto> createNewPerson(@RequestBody PersonDto personDto) {
    Person newPerson = personService.create(personDto.toPerson());
    return ResponseEntity.status(HttpStatus.CREATED).body(new PersonResponseDto(
        newPerson.getId(), newPerson.getUsername(), newPerson.getRole()));

  }


}

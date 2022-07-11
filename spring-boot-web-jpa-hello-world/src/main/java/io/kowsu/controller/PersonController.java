package io.kowsu.controller;

import io.kowsu.entity.Person;
import io.kowsu.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping(value = "/create")
    public Person create(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping(value = "/get")
    public List<Person> getPersons() {
        return personService.getPersons();
    }
}

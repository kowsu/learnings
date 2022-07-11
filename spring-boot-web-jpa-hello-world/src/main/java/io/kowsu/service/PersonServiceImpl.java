package io.kowsu.service;

import io.kowsu.entity.Person;
import io.kowsu.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person getPerson(Integer id) {
        return personRepository.getReferenceById(id);
    }

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
}

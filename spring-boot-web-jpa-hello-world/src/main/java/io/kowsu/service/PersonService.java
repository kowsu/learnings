package io.kowsu.service;


import io.kowsu.entity.Person;

import java.util.List;

public interface PersonService {

    public Person createPerson(Person person);
    public Person getPerson(Integer id);
    public List<Person> getPersons();

}

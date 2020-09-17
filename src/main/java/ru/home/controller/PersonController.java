package ru.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.home.dto.Person;
import ru.home.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/{personName}")
    public Person getCountry(@PathVariable("personName") String personName) {
        return personRepository.findPerson(personName);
    }

    @PostMapping("/add")
    public Person addCountry(@RequestBody Person person) {
        return personRepository.addPerson(person);
    }

    @DeleteMapping("/{personName}")
    public Person deleteCountry(@PathVariable("personName") String personName) {
        return personRepository.deletePerson(personName);
    }
}

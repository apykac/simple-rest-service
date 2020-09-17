package ru.home.repository;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import ru.home.dto.Address;
import ru.home.dto.Person;
import ru.home.dto.Town;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepository {
    private static final Map<String, Person> PERSONS = new HashMap<>();

    @PostConstruct
    public void initData() {
        createPerson("Vasya", "Pupkin", "Pupkovich", 25, 5, 4, "Super", Town.MOSCOW);
        createPerson("Kat'ka", "Dronova", "Jgbanik", 23, 2, 5, "Avgan", Town.KRASNOGORSK);
    }

    private void createPerson(String firstName,
                              String surname,
                              String middleName,
                              int age,
                              int build,
                              int room,
                              String street,
                              Town town) {
        Address address = new Address(town, street, BigInteger.valueOf(build), BigInteger.valueOf(room));
        address.setBuild(BigInteger.valueOf(build));
        address.setRoom(BigInteger.valueOf(room));
        address.setStreet(street);
        address.setTown(town);

        Person person = new Person(firstName, surname, middleName, age, address);
        person.setFirstName(firstName);
        person.setSurname(surname);
        person.setMiddleName(middleName);
        person.setAge(age);
        person.setAddress(address);

        PERSONS.put(person.getFirstName(), person);
    }

    public Person findPerson(String name) {
        Assert.notNull(name, "The person name must not be null");
        return PERSONS.get(name);
    }

    public Person deletePerson(String name) {
        Assert.notNull(name, "The person name must not be null");
        return PERSONS.remove(name);
    }

    public Person addPerson(Person person) {
        Assert.notNull(person, "The person must not be null");
        return PERSONS.put(person.getFirstName(), person);
    }
}

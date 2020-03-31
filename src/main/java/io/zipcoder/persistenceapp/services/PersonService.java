package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.dtos.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class PersonService
{


    public Person create(Person person)
    {
        return null;
    }

    public Person create(Long id, String firstName, String lastName, LocalDate birthday, Long homeId)
    {
        Person p = new Person(id, firstName, lastName, birthday, homeId);

        return p;
    }

    public void remove(Long id)
    {

    }

    public void remove(Person personToRemove)
    {

    }

    public void update(Long id, Person updatedPerson)
    {

    }

    public Person findById(Long id)
    {
        return null;
    }

    public List<Person> findByFirstName(String firstName)
    {
        return null;
    }

    public List<Person> findByLastName(String lastName)
    {
        return null;
    }

    public List<Person> findByBirthdate(LocalDate birthday)
    {
        return null;
    }

    public Map<String, List<Person>> mapOfLastName(String lastName)
    {
        return null;
    }

    public Map<String, Integer> occurrencesOfFirstName(String firstName)
    {
        return null;
    }
}
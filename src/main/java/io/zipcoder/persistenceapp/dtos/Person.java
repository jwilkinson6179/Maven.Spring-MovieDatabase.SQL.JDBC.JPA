package io.zipcoder.persistenceapp.dtos;

import java.time.LocalDate;

public class Person
{
    Long id;
    String firstName;
    String lastName;
    LocalDate birthday;
    Long homeId;

    public Person(Long id, String firstName, String lastName, LocalDate birthday, Long homeId)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.homeId = homeId;
    }

    public Person()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(LocalDate birthday)
    {
        this.birthday = birthday;
    }

    public Long getHomeId()
    {
        return homeId;
    }

    public void setHomeId(Long homeId)
    {
        this.homeId = homeId;
    }
}
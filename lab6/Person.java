package com.company.lab6;
import javax.naming.Name;
import java.util.Date;

public class Person {

    Hospital []hospital1;

    String title;
    String givenName;
    String middleName;
    String familyName;
    Name name;
    Date birthDate;
    Gender gender;
    String homeAdrress;
    Integer phone;


    public enum Gender{
        M, F
    }

    public Person(String title, String givenName, String middleName, String familyName, Name name, Date birthDate, Gender gender, String homeAdrress, Integer phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAdrress = homeAdrress;
        this.phone = phone;
    }
}

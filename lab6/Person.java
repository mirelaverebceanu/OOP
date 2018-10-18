package com.company.lab6;
import javax.naming.Name;
import java.util.Date;

public class Person {

    Hospital []hospital1;

    String title;
    String givenName;
    String middleName;
    String familyName;
    FullName persname;
    Date birthDate;
    Gender gender;
    Address homeAdrress;
    Phone phone;


    public enum Gender{
        M, F
    }

    public Person(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName persname, Date birthDate, Gender gender, Address homeAdrress, Phone phone) {
        this.hospital1 = hospital1;
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.persname = persname;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAdrress = homeAdrress;
        this.phone = phone;
    }
}

package com.company.lab6;

import javax.naming.Name;
import java.util.Date;

public class Receptionist extends FrontDeskStaff {

    public Receptionist(String title, String givenName, String middleName, String familyName, Name name, Date birthDate, Gender gender, String homeAdrress, Integer phone) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAdrress, phone);
    }
}
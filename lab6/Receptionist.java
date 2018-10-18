package com.company.lab6;

import javax.naming.Name;
import java.util.Date;

public class Receptionist extends FrontDeskStaff {

    public Receptionist(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName persname, Date birthDate, Gender gender, Address homeAdrress, Phone phone, Date joined, String education, String certification, String languages) {
        super(hospital1, title, givenName, middleName, familyName, persname, birthDate, gender, homeAdrress, phone, joined, education, certification, languages);
    }
}

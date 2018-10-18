package com.company.lab6;

import java.util.Date;

//
public class Surgeon extends Doctor {
    public Surgeon(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName persname, Date birthDate, Gender gender, Address homeAdrress, Phone phone, Department d1, Date joined, String education, String certification, String languages, Patient[] patient2, String speciality, String locations) {
        super(hospital1, title, givenName, middleName, familyName, persname, birthDate, gender, homeAdrress, phone, d1, joined, education, certification, languages, patient2, speciality, locations);
    }
}

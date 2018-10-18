package com.company.lab6;

import java.util.Date;

public class Doctor extends OperationStaff {
    String speciality;
    String locations;

    public Doctor(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName persname, Date birthDate, Gender gender, Address homeAdrress, Phone phone, Date joined, String education, String certification, String languages, Patient[] patient2, String speciality, String locations) {
        super(hospital1, title, givenName, middleName, familyName, persname, birthDate, gender, homeAdrress, phone, joined, education, certification, languages, patient2);
        this.speciality = speciality;
        this.locations = locations;
    }
}

package com.company.lab6;

import javax.naming.Name;
import java.util.Date;

public class Patient extends Person {

    OperationStaff []ostaff;
    String id;
    FullName pname;
    Gender pgender;
    Integer age;
    Date accepted;
    History sicknes;
    String []prescriptions;
    String []allergies;
    String []specialReqs;

    public Patient(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName persname, Date birthDate, Gender gender, Address homeAdrress, Phone phone, OperationStaff[] ostaff, String id, FullName pname, Gender pgender, Integer age, Date accepted, History sicknes, String[] prescriptions, String[] allergies, String[] specialReqs) {
        super(hospital1, title, givenName, middleName, familyName, persname, birthDate, gender, homeAdrress, phone);
        this.ostaff = ostaff;
        this.id = id;
        this.pname = pname;
        this.pgender = pgender;
        this.age = age;
        this.accepted = accepted;
        this.sicknes = sicknes;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }
}

package com.company.lab6;

import javax.naming.Name;
import java.util.Date;

public class OperationStaff extends Staff {
    public OperationStaff(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName persname, Date birthDate, Gender gender, Address homeAdrress, Phone phone, Date joined, String education, String certification, String languages, Patient[] patient2) {
        super(hospital1, title, givenName, middleName, familyName, persname, birthDate, gender, homeAdrress, phone, joined, education, certification, languages);
        this.patient2 = patient2;
    }

    Patient [] patient2;
}

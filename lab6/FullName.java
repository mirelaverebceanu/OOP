package com.company.lab6;

public class FullName {
    String name;
    public FullName(String gname,String mname, String fname) {
        name = gname + " " + mname+" "+ fname;
    }
    public String FullName() {
        return name;

    }
}

package com.va.week7;

public class Student {
    private String studentId;
    private String fname;
    private String lname;
    private String phone;
    private String dob;
    private String street;
    private String city;
    private String number;

    public Student(String studentId, String fname, String lname, String phone, String dob, String street, String city, String number) {
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.dob = dob;
        this.street = street;
        this.city = city;
        this.number = number;
    }

    // Add Getters only (no setters needed for static data)

    public String getStudentId() { return studentId; }
    public String getFname() { return fname; }
    public String getLname() { return lname; }
    public String getPhone() { return phone; }
    public String getDob() { return dob; }
    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getNumber() { return number; }
}

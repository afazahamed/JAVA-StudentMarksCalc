package com.company;

public class Student extends Marks {
    private String stname;
    private String address;

    Student(String stname, String address, int mk1, int mk2, int mk3){
        super(mk1,mk2,mk3);
        this.stname = stname;
        this.address = address;
    }

    Student(String stname, String address, int mk1, int mk2){
        super(mk1,mk2);
        this.stname = stname;
        this.address = address;
    }

    public void setStName(String nam){

        this.stname = nam;
    }

    public String getStname(){

        return stname;
    }

    public void setAddress(String add){

        this.address = add;
    }

    public String getAddress(){

        return address;
    }
}

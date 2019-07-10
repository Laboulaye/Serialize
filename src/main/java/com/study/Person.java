package com.study;

import java.io.*;

public class Person implements Serializable {

    public String name;
    public int age;
    public transient String address; //не записываем адресс в файл, т.к. является конфиденциальным
    public String specialty;

    public Person() {}

    public Person(String name, int age, String address, String specialty) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString(){
        return ("Person: " + getName() + "\tage: " + getAge() + "\tAddress: " + getAddress() + "\tSpecialty: " + getSpecialty() );
    }
}
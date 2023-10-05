/*
* File: Employee.java
* Author: Paulusz Zsombor
* Copyright: 2023, Paulusz Zsombor
* Group:        
* Date: 2023-10-05
* Github: https://github.com/PZsombor/
* Licenc: GNU GPL
*/

package models;

public class Employee {
    String name;
    String city;
    String address;
    String birth;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
}


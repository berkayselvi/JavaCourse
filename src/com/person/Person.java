package com.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age > 100 || age < 0) this.age = 0;
        else this.age = age;
    }

    public String getFirstName(){
       return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen(){
        if(age < 20 && age > 12) return true;
        else return false;
    }

    public String getFullName(){
        if (getFirstName().isEmpty() == true && getLastName().isEmpty() == false) return getLastName();
        else if (getFirstName().isEmpty() && getLastName().isEmpty()) return "";
        else if (firstName.isEmpty() == false && getLastName().isEmpty() == true) return getFirstName();
        else return (getFirstName() + " " + getLastName());
    }

}

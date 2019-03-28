package com.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("berkay");
        person.setLastName("selvi");
        person.setAge(19);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        System.out.println("age = " + person.getAge());


    }
}

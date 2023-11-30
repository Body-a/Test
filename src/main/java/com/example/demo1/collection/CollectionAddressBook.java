package com.example.demo1.collection;

import com.example.demo1.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class CollectionAddressBook implements AddressBook{


    private String randomName;

    @Override
    public void save(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    ObservableList<Person> personList = FXCollections.observableArrayList();

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ObservableList<Person> personList) {
        this.personList = personList;
    }

    public void print(){
        int number = 0;

        for (Person p: personList){
            number++;
            System.out.println(number + "pip" + p.getPip() + " phone " + p.getPhone());
        }
    }


    public static final String[] FIRST_NAMES = {"John", "Jane", "David", "Emily", "Michael", "Sophia", "Christopher", "Olivia"};

    public static void main(String[] args) {
        String randomName = generateRandomName();
        System.out.println("Random Name: " + randomName);
    }

    public static String generateRandomName() {
        Random random = new Random();
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        return firstName + " " ;
    }

    public void fillTestData(){
        personList.add(new Person(randomName,"097111111111"));
        personList.add(new Person("Vitalii","097222222222"));
        personList.add(new Person("Ivan","097333333333"));
        personList.add(new Person("Arsen","097444444444"));
        personList.add(new Person("Taras","097555555555"));
        personList.add(new Person("Artur","097666666666"));
    }
}

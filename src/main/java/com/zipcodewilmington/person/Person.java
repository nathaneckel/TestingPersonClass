package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    //ha
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    //added variables gender/generation/hobby/netWorth/isMarried
    public Person(String name, int age, String gender, String generation, String hobby, int netWorth, Boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.generation = generation;
        this.hobby = hobby;
        this.netWorth = netWorth;
        this.isMarried = isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setNetWorth(Integer netWorth) {
        this.netWorth = netWorth;
    }

    public void setIsMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }

    public String getGeneration() {
        return this.generation;
    }

    public String getHobby() {
        return this.hobby;
    }

    public Integer getNetWorth() {
        return this.netWorth;
    }

    public Boolean getIsMarried() {
        return this.isMarried;
    }
}

package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    public void testConstructorWithEverything() {
        // Given
        String expectedName = "Leon";
        Integer expectedAge = 55;
        String expectedGender = "Male";
        String expectedGeneration = "X";
        String expectedHobby = "The Blues";
        Integer expectedNetWorth = 1000000;
        Boolean expectedIsMarried = false;


        // When
        Person person = new Person(expectedName, expectedAge, expectedGender,
                expectedGeneration, expectedHobby, expectedNetWorth, expectedIsMarried);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualGender = person.getGender();
        String actualGeneration = person.getGeneration();
        String actualHobby = person.getHobby();
        Integer actualNetWorth = person.getNetWorth();
        Boolean actualIsMarried = person.getIsMarried();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedGeneration, actualGeneration);
        Assert.assertEquals(expectedHobby, actualHobby);
        Assert.assertEquals(expectedNetWorth, actualNetWorth);
        Assert.assertEquals(expectedIsMarried, actualIsMarried);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    public void testConstructorWithGender() {
        // Given
        String expectedGender = "Male";

        // When
        Person person = new Person(expectedGender);

        // Then
        String actualGender = person.getGender();

        Assert.assertEquals(expectedGender, actualGender);
    }
    public void testConstructorWithGeneration() {
        // Given
        String expectedGeneration = "X";

        // When
        Person person = new Person(expectedGeneration);

        // Then
        String actualGeneration = person.getGeneration();

        Assert.assertEquals(expectedGeneration, actualGeneration);
    }

    public void testConstructorWithHobby() {
        // Given
        String expectedHobby = "The Blues";

        // When
        Person person = new Person(expectedHobby);

        // Then
        String actualHobby = person.getHobby();

        Assert.assertEquals(expectedHobby, actualHobby);
    }
    public void testConstructorWithNetWorth() {
        // Given
        Integer expectedNetWorth = 1000000;
        Boolean expectedIsMarried = false;


        // When
        Person person = new Person(expectedNetWorth);

        // Then
        Integer actualNetWorth = person.getNetWorth();

        Assert.assertEquals(expectedNetWorth, actualNetWorth);

    }
    public void testConstructorWithIsMarried() {
        // Given
        Boolean expectedIsMarried = false;


        // When
        Person person = new Person(String.valueOf(expectedIsMarried));

        // Then
        Boolean actualIsMarried = person.getIsMarried();

        Assert.assertEquals(expectedIsMarried, actualIsMarried);

    }
}
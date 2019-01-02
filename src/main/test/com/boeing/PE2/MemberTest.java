package com.boeing.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    @Before
    public void setUp() throws Exception {
        Member employee = new Member();
    }

    @After
    public void tearDown() throws Exception {
        employee = null;
    }

    @Test
    public void inputTypeString(){

        //Arrange
        String expectedValue ="String";

        //Act
        String actualValue = employee.inputType("abcde");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputTypeDigit(){

        //Arrange
        String expectedValue ="Digit";

        //Act
        String actualValue = employee.inputType("12345");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputTypeInvalid(){

        //Arrange
        String expectedValue ="Invalid";

        //Act
        String actualValue = employee.inputType("abcd1234");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setNamePass(){

        //Arrange
        Boolean expectedValue = true;

        //Act
        Boolean actualValue = employee.setName("abcd");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setNameFail(){

        //Arrange
        Boolean expectedValue = false;

        //Act
        Boolean actualValue = employee.setName("abcd234");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setAgePass(){

        //Arrange
        Boolean expectedValue = true;

        //Act
        Boolean actualValue = employee.setAge("125");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setAgeFail(){

        //Arrange
        Boolean expectedValue = false;

        //Act
        Boolean actualValue = employee.setAge("126");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setAgeFail(){

        //Arrange
        Boolean expectedValue = false;

        //Act
        Boolean actualValue = employee.setAge("12c");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setSalaryPass (){

        //Arrange
        Boolean expectedValue = true;

        //Act
        Boolean actualValue = employee.setSalary("12213");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setSalaryFail (){

        //Arrange
        Boolean expectedValue = false;

        //Act
        Boolean actualValue = employee.setSalary("12213qw");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getNamePass (){

        //Arrange
        Boolean nameSet = employee.setName("abcd");
        String expectedValue = "abcd";

        //Act
        String actualValue = employee.getName();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getAgePass (){

        //Arrange
        Boolean nameSet = employee.setAge("25");
        int expectedValue = 25;

        //Act
        int actualValue = employee.getAge();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getSalaryPass (){

        //Arrange
        Boolean nameSet = employee.setSalary(1200);
        int expectedValue = 1200;

        //Act
        int actualValue = employee.getSalary();

        //Assert
        assertEquals(expectedValue, actualValue);
    }


}
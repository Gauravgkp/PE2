package com.boeing.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
        Factorial factorail = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        factorial = null;
    }

    @Test
    public void intFactorialPass(){
        //Arrange
        String expectedValue = "The factorial of 1 is is 1.";

        //Act
        String actualValue = factorial.intFactorail(1);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void intFactorialPass(){
        //Arrange
        String expectedValue = "The factorial of 13 is out of range.";

        //Act
        String actualValue = factorial.intFactorail(13);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void intFactorialFail(){
        //Arrange
        String expectedValue = "The factorial of 13 is out of range.";

        //Act
        String actualValue = factorial.intFactorail(13);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void longFactorialPass(){
        //Arrange
        String expectedValue = "The factorial of 20 is is 2432902008176640000.";

        //Act
        String actualValue = factorial.longFactorail(20);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void longFactorialFail(){
        //Arrange
        String expectedValue = "The factorial of 21 is out of range.";

        //Act
        String actualValue = factorial.longFactorail(21);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void MAX_VALUE_Check(){
        //Arrange
        long expectedValue = 9223372036854775807;

        //Act
        String actualValue = factorial.MAX_VALUE;

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}
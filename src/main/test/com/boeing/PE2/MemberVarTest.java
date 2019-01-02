package com.boeing.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVarTest {

    @Before
    public void setUp() throws Exception {
        MemberVar employee1 = new MemberVar();
    }

    @After
    public void tearDown() throws Exception {
        employee1 = null;
    }

    @Test
    public void instantiateInitialisePass() {

        //Arrange
        boolean expectedValue =true;

        //Act
        boolean actualValue = employee1.instantiateInitialise("abcd", 25, 12000);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void displayPass() {

        //Arrange
        boolean expectedValue =true;

        //Act
        boolean actualValue = employee1.display();

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    
}
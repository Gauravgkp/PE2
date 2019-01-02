package com.boeing.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Before
    public void setUp() throws Exception {
        Students student = new Students();
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void inputGradePass(){

        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = student.inputGrade(4);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputGradeValidPass(){

        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = student.inputGradeValid(40);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputGradeValidFail(){

        //Arrange
        boolean expectedValue = false;

        //Act
        boolean actualValue = student.inputGradeValid(101);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputGradeAvgPass(){

        //Arrange
        int expectedValue = 60;
        int grades[] = {60,60,60,60} ;

        //Act
        int actualValue = student.gradeAvg(grades);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputGradeMinPass(){

        //Arrange
        int expectedValue = 60;
        int grades[] = {80,60,90,70} ;

        //Act
        int actualValue = student.gradeMin(grades);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputGradeMaxPass(){

        //Arrange
        int expectedValue = 90;
        int grades[] = {80,60,90,70} ;

        //Act
        int actualValue = student.gradeMin(grades);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}
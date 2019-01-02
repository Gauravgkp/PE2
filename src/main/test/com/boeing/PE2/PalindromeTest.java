package com.boeing.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
        Palindrome palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        palindrome = null ;
    }

    @Test
    public void reverseInputPass() {

        //Arrange
        String expectedValue="abcdefg";

        //Act
        String actualValue = palindrome.reverseInput("gfedcba");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isPalindromeTestPass() {

        //Arrange
        String expectedValue="abcdcba is a palindrome input";

        //Act
        String actualValue = palindrome.checkPalindrome("abcdcba");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isPalindromeTestFail() {

        //Arrange
        String expectedValue="abcdefg is a palindrome input";

        //Act
        String actualValue = palindrome.checkPalindrome("abcdefg");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

}
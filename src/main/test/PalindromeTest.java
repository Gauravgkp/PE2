import org.junit.After;
import org.junit.Before;
import org.junit.Test;

        import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @org.junit.Before
    public void setUp() throws Exception {
        Palindrome palindrome = new Palindrome();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        palindrome=null;
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
        String expectedValue="abcdcba";

        //Act
        String actualValue = palindrome.checkpalindrome("abcdcba");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isPalindromeTestFail() {

        //Arrange
        String expectedValue="abcdefg";

        //Act
        String actualValue = palindrome.checkpalindrome("abcdefg");

        //Assert
        assertNotEquals(expectedValue, actualValue);
    }
}
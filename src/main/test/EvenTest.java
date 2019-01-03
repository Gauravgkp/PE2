import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {
    Even even = new Even();

    @Before
    public void setUp() throws Exception {
        Even even = new Even();
    }

    @After
    public void tearDown() throws Exception {
        even = null;
    }

    @Test
    public void isEvenPass(){
        //Arrange
        Boolean expectedValue =true;

        //Act
        Boolean actualValue = even.isEven(28);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isEvenFail(){
        //Arrange
        Boolean expectedValue =false;

        //Act
        Boolean actualValue = even.isEven(27);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}
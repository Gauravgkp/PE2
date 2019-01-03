import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RootTest {
    Root root = new Root();
    @Before
    public void setUp() throws Exception {
        Root root = new Root();
    }

    @After
    public void tearDown() throws Exception {
        root = null;
    }

    @Test
    public void inputIsNumberFail() {

        //Arrange
        boolean expectedValue=false;

        //Act
        boolean actualValue = root.isNumber("1234567");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputIsNumberPass() {

        //Arrange
        boolean expectedValue=false;

        //Act
        boolean actualValue = root.isNumber("gfedcba");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void squareRootPass() {

        //Arrange
        boolean expectedValue= true;

        //Act
        boolean actualValue = root.powerOf(16);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void squareRootFail() {

        //Arrange
        boolean expectedValue= false;

        //Act
        boolean actualValue = root.powerOf(1325);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}
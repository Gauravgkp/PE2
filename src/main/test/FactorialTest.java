import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

   Factorial factorial;
   @Before
   public void setUp() throws Exception {
       factorial = new Factorial();
   }

   @After
   public void tearDown() throws Exception {
       factorial = null;
   }

   @Test
   public void intFactorialPass(){
       //Arrange
       String expectedValue = "The Factorial of 2 is: 2";

       //Act
       String actualValue = factorial.intFactorial(2);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

   @Test
   public void intFactorialPass1(){
       //Arrange
       String expectedValue = "false";

       //Act
       String actualValue = factorial.intFactorial(13);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

   @Test
   public void intFactorialFail(){
       //Arrange
       String expectedValue = "The factorial of 13 is out of range.";

       //Act
       String actualValue = factorial.intFactorial(13);

       //Assert
       assertNotEquals(expectedValue, actualValue);
   }

   @Test
   public void longFactorialPass(){
       //Arrange
       String expectedValue = "The Factorial of 20 is: 2432902008176640000";

       //Act
       String actualValue = factorial.longFactorial(20);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

   @Test
   public void longFactorialFail(){
       //Arrange
       String expectedValue = "false";

       //Act
       String actualValue = factorial.longFactorial(21);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

}import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

   Factorial factorial;
   @Before
   public void setUp() throws Exception {
       factorial = new Factorial();
   }

   @After
   public void tearDown() throws Exception {
       factorial = null;
   }

   @Test
   public void intFactorialPass(){
       //Arrange
       String expectedValue = "The Factorial of 2 is: 2";

       //Act
       String actualValue = factorial.intFactorial(2);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

   @Test
   public void intFactorialPass1(){
       //Arrange
       String expectedValue = "false";

       //Act
       String actualValue = factorial.intFactorial(13);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

   @Test
   public void intFactorialFail(){
       //Arrange
       String expectedValue = "The factorial of 13 is out of range.";

       //Act
       String actualValue = factorial.intFactorial(13);

       //Assert
       assertNotEquals(expectedValue, actualValue);
   }

   @Test
   public void longFactorialPass(){
       //Arrange
       String expectedValue = "The Factorial of 20 is: 2432902008176640000";

       //Act
       String actualValue = factorial.longFactorial(20);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

   @Test
   public void longFactorialFail(){
       //Arrange
       String expectedValue = "false";

       //Act
       String actualValue = factorial.longFactorial(21);

       //Assert
       assertEquals(expectedValue, actualValue);
   }

}

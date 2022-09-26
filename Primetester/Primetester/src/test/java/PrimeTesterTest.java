import exceptions.OuchIFoundThirtySevenAndHenceMustDieException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTesterTest {
    private NumberUnderTest number = new NumberUnderTest();
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setup() {
        // Arrange
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void primesToThreeReturnTwoAndThree() {
        // Arrange
        PrimeTester tester = new PrimeTester(number, 3);

        // Act
        tester.run();

        // Assert
        String streamOutput = outputStream.toString();
        assertTrue(streamOutput.contains(" found a prime number: 2") && streamOutput.contains(" found a prime number: 3"));
    }

    @Test
    void primeValue37ThrowsException() {
        // Arrange
        PrimeTester tester = new PrimeTester(number, 37);

        // Assert
        assertThrows(OuchIFoundThirtySevenAndHenceMustDieException.class, tester::startTesting);
    }

}
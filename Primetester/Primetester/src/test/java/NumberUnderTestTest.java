import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUnderTestTest {

    private NumberUnderTest sut;

    @BeforeEach
    void setup() {
        // Arrange
        var sut = new NumberUnderTest();
    }

    @Test
    void getNumberReturnsZero() {
        // Act
        int numberZero = sut.getNumber();

        // Assert
        assertEquals(0, numberZero);
    }

    @Test
    void getFourNumbersReturnsZeroTillThree() {
        //Act
        int numberZero = sut.getNumber();
        int numberOne = sut.getNumber();
        int numberTwo = sut.getNumber();
        int numberThree = sut.getNumber();

        // Assert
        assertEquals(0, numberZero);
        assertEquals(1, numberOne);
        assertEquals(2, numberTwo);
        assertEquals(3, numberThree);


    }
}
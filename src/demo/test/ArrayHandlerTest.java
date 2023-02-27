package demo.test;

import demo.ArrayHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ArrayHandlerTest {

    ArrayHandler arrayHandler;

    @BeforeEach
    void setUp() {
        arrayHandler = new ArrayHandler();
    }

    @Test
    void isHasOnlyOneAndFourWithAllOneFalseTest() {

        int[] arr = {1, 1, 1, 1};
        boolean actual = arrayHandler.isHasOnlyOneAndFour(arr);
        assertFalse(actual);
    }

    @Test
    void isHasOnlyOneAndFourTestAllFourFalseTest() {
        int[] arr = {4, 4, 4, 4};
        boolean actual = arrayHandler.isHasOnlyOneAndFour(arr);
        assertFalse(actual);
    }

    @Test
    void isHasOnlyOneAndFourTestTrueTest() {
        int[] arr = {1, 4, 4, 4, 1, 1, 4};
        boolean actual = arrayHandler.isHasOnlyOneAndFour(arr);
        assertTrue(actual);
    }

    @Test
    void isHasOnlyOneAndFourWithDifferentNumbersFalseTest() {
        int[] arr = {1, 1, 1, 1, 4, 5, 3, 15, 27};
        boolean actual = arrayHandler.isHasOnlyOneAndFour(arr);
        assertFalse(actual);
    }

    @Test
    void getAllAfterFourWhenNoOneFourShouldExceptionTest() {
        int[] arr = {1, 1, 9, 1, 5, 3, 15, 27};
        assertThrows(RuntimeException.class, () -> arrayHandler.getAllAfterFour(arr));
    }

    @Test
    void getAllAfterFourWhenFourLastShouldEmptyArrTest() {
        int[] arr = {1, 1, 9, 1, 4, 3, 15, 4};
        int[] actual = arrayHandler.getAllAfterFour(arr);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllAfterFourEqualsTest() {
        int[] arr = {1, 1, 9, 4, 4, 3, 15, 3};
        int[] actual = arrayHandler.getAllAfterFour(arr);
        int[] expected = {3, 15, 3};
        assertArrayEquals(expected, actual);
    }
}

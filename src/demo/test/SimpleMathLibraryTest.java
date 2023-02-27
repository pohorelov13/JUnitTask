package demo.test;

import demo.SimpleMathLibrary;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {

    SimpleMathLibrary simpleMathLibrary;

    @BeforeAll
    static void start() {
        System.out.println("START");
    }

    @BeforeEach
    void setUp() {
        simpleMathLibrary = new SimpleMathLibrary();
    }

    @Test
    void addTest() {
        double add = simpleMathLibrary.add(5, 15);
        if (add == 20) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
            throw new AssertionError();
        }
    }

    @Test
    void minusTest() {
        double minus = simpleMathLibrary.minus(15, 5);
        if (minus == 10) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
            throw new AssertionError();
        }
    }

    @AfterAll
    static void end() {
        System.out.println("END");
    }
}

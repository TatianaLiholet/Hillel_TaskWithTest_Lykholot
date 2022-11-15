package lesson15;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FibonacciTest {

    @Test
    public void fibonachiQounterTest(){
        Fibonacci fibonacci = new Fibonacci();
        int actual = fibonacci.fibonachiQounter(6);
        int expected = 8;
        assertEquals(expected, actual);
    }
    }

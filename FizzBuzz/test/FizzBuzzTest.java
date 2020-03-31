import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizz() {
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(3);
        assertEquals(expected,result);
    }
    @Test
    void checkBuzz() {
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(5);
        assertEquals(expected,result);
    }

    @Test
    void checkFizzBuzz() {
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(30);
        assertEquals(expected,result);
    }
    @Test
    void checknumber1() {
        String expected = "bon";
        String result = FizzBuzz.checkFizzBuzz(4);
        assertEquals(expected,result);
    }
    @Test
    void checknumber2() {
        String expected = "hai muoi ba";
        String result = FizzBuzz.checkFizzBuzz(23);
        assertEquals(expected,result);
    }
}
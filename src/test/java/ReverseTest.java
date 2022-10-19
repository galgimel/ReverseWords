import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverseWordAndNumbers() {
        var rev = new Reverse();

        String expected = "1ut";
        String actual = rev.reverse("1tu");

        assertEquals(expected, actual);
    }
    @Test
    void reverseNumbers() {
        var rev = new Reverse();

        String expected = "123";
        String actual = rev.reverse("123");

        assertEquals(expected, actual);
    }
    @Test
    void reverseSpace() {
        var rev = new Reverse();

        String expected = " ";
        String actual = rev.reverse(" ");

        assertEquals(expected, actual);
    }
    @Test
    void reverseEmptySpace() {
        var rev = new Reverse();

        String expected = "";
        String actual = rev.reverse("");

        assertEquals(expected, actual);
    }
    @Test
    void reverseMirrorWord() {
        var rev = new Reverse();

        String expected = "ротор";
        String actual = rev.reverse("ротор");

        assertEquals(expected, actual);
    }
    @Test
    void reverseTwoWords() {
        var rev = new Reverse();

        String expected = "1гав2 3мяу4";
        String actual = rev.reverse("1уям2 3ваг4");

        assertEquals(expected, actual);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest3 {

    @Test
    void reverse() {
        var rev = new Reverse();

        String expected = " ";
        String actual = rev.reverse(" ");

        assertEquals(expected, actual);
    }
}
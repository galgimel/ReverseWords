import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        var rev = new Reverse();

        String expected = "1ut";
        String actual = rev.reverse("1tu");

        assertEquals(expected, actual);
    }
}
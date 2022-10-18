import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest5 {

    @Test
    void reverse() {
        var rev = new Reverse();

        String expected = "ротор";
        String actual = rev.reverse("ротор");

        assertEquals(expected, actual);
    }
}
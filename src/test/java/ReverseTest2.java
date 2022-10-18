import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest2 {

    @Test
    void reverse() {
        var rev = new Reverse();

        String expected = "123";
        String actual = rev.reverse("123");

        assertEquals(expected, actual);
    }
}
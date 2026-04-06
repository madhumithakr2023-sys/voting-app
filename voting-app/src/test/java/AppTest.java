import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testFirstVote() {
        String result = App.vote("user1");
        assertEquals("Vote Counted ✅", result);
    }

    @Test
    void testDuplicateVote() {
        App.vote("user2");
        String result = App.vote("user2");
        assertEquals("Duplicate Vote ❌", result);
    }
}
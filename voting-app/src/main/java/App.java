import java.util.HashSet;
import java.util.Set;

public class App {

    private static Set<String> voters = new HashSet<>();

    public static String vote(String voterId) {
        if (voters.contains(voterId)) {
            return "Duplicate Vote ❌";
        } else {
            voters.add(voterId);
            return "Vote Counted ✅";
        }
    }

    public static void main(String[] args) {
        System.out.println(vote("user1"));
        System.out.println(vote("user1")); // duplicate
    }
}
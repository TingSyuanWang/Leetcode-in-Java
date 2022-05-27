import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
    ValidAnagram ValidAnagram = new ValidAnagram();

    @Test
    void Example1() {
        String s = "anagram";
        String t = "nagaram";

        boolean results = ValidAnagram.isAnagram(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "rat";
        String t = "car";

        boolean results = ValidAnagram.isAnagram(s, t);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}

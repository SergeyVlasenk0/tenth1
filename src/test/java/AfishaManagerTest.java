import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void testAdd() {
        AfishaManager afisha = new AfishaManager();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] expected = { "Movie 1", "Movie 2", "Movie 3" };
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast() {
        AfishaManager afisha = new AfishaManager(3);
        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast10() {
        AfishaManager afisha = new AfishaManager(10);
        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

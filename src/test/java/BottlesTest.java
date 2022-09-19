import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottlesTest {
    @Test
    public void test_verse_99() {
        String expected = "99 bottles of beer on the wall," +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n";
        assertEquals(expected, new Bottle().verse(99));
    }

    @Test
    public void test_verse_3() {
        String expected = "3 bottles of beer on the wall," +
                "3 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "2 bottles of beer on the wall.\n";
        assertEquals(expected, new Bottle().verse(3));
    }

    @Test
    public void test_verse_2() {
        String expected = "2 bottles of beer on the wall," +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n";
        assertEquals(expected, new Bottle().verse(2));
    }

    @Test
    public void test_verse_1() {
        String expected = "1 bottle of beer on the wall," +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n";
        assertEquals(expected, new Bottle().verse(1));
    }

    @Test
    public void test_verse_0() {
        String expected = "No more bottles of beer on the wall," +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";
        assertEquals(expected, new Bottle().verse(0));
    }

    @Test
    public void test_a_couple_verses() {
        String expected = "99 bottles of beer on the wall," +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n" +
                "\n" +
                "98 bottles of beer on the wall," +
                "98 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "97 bottles of beer on the wall.\n";
        assertEquals(expected, new Bottle().verses(99, 98));
    }

//    @Test
//    public void test_verse_6() {
//        String expected = "1 six-pack of beer on the wall," +
//                "1 six-pack of beer.\n" +
//                "Take one down and pass it around, " +
//                "5 bottles of beer on the wall.\n";
//        assertEquals(expected, new Bottle().verse(6));
//    }
}

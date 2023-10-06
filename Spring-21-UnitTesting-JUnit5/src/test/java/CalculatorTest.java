import org.junit.jupiter.api.*;

import java.nio.file.AccessDeniedException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll is executed");
    }

    @BeforeEach
    void setUpEach() {
        System.out.println("BeforeEach is executed");
    }

    @AfterEach()
    void tearDownEach() {
        System.out.println("AfterEach is executed");
    }

    @Test
    void testCase1() {
        System.out.println("Test Case 1");
//        fail("Not implemented yet");
    }

    @Test
    void testCase2() {
        System.out.println("Test Case 2");
        assertTrue(Calculator.operator.equals("add"));
//        assertEquals("add", Calculator.operator);
    }

    @Test
    void testCase3() {
        System.out.println("Test Case 3");
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test
    void testCase4() {
        String nullString = null;
        String notNullString = "Cydeo";
        System.out.println("Test Case 4");
//        assertNull(nullString);
//        assertNotNull(notNullString);
//        assertNull(notNullString);
//        assertNotNull(nullString);
    }

    @Test
    void testCase5() {
        System.out.println("Test Case 5");
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        assertSame(c1, c2);
        assertNotSame(c1, c3);
    }

    @Test
    void add() {
        System.out.println("add");
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual, "It is not matching with expected value.");
    }

    @Test
    void add2() {
        System.out.println("add2");
//        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(1, 2));
    }



}

package by.it.avramchuk.tentacles.test;

import by.it.avramchuk.tentacles.FirstUsingJUnit;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class FirstUsingJUnitTest {

    private FirstUsingJUnit instance = new FirstUsingJUnit();

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
            }

    @AfterEach
    void tearDown() {
    }

    @Test
    void methodTest1() {
        int expected = 1;
        assertEquals(expected, instance.method());
    }

    @Test
    void methodTest2() {
        FirstUsingJUnit instance  = new FirstUsingJUnit();
        assertTimeout(Duration.ofMillis(1), ()-> {instance.method();});
    }

    @Test
    void exceptionThrowTest(){
        assertThrows(Exception.class, ()-> {throw new Exception();});
    }

    @Test
    void assumingTest(){
        assumeTrue(instance.method()==1);
        System.out.println("won't be printed.....or not");
    }

    @Test
    void assumingTest2(){
        assumingThat(instance.method()==1, ()->{
            System.out.println("Will be printed");
        });
    }
}
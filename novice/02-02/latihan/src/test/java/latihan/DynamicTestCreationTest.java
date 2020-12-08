package latihan;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DynamicTestCreationTest {

    @TestFactory
    public Stream<DynamicTest> testMultiplyException() {
        MyClass tester = new MyClass();
        int[][] data = new int[][] { { 1, 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
        return Arrays.stream(data).map(entry -> {
            int m1 = entry[0];
            int m2 = entry[1];
            int expected = entry[2];
            return dynamicTest(m1 + " * " + m2 + " = " + expected, () -> {
                assertEquals(expected, tester.multiply(m1, m2));
            });
        });
    }    

    public static int[][] data() {
        return new int[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
    }

    @ParameterizedTest
    @MethodSource(value = "data")
    void testWithStringParameter(int[] data) {
        MyClass tester = new MyClass();
        int m1 = data[0];
        int m2 = data[1];
        int expected = data[2];
        assertEquals(expected, tester.multiply(m1, m2));
    }

}
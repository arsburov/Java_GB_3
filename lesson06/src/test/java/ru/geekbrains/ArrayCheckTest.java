package ru.geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayCheckTest {
    Integer[] testArrayFalse = new Integer[] {1, 0, 2};
    Integer[] testArrayTrue = new Integer[] {1, 4, 2};
    @Test
    public void shouldCheckArrayWithFalseResult(){
        Assertions.assertFalse(ArrayCheck.arrayChecker(testArrayFalse));
    }

    @Test
    public void shouldCheckArrayWithTrueResult(){
        Assertions.assertTrue(ArrayCheck.arrayChecker(testArrayTrue));
    }
}

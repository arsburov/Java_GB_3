package ru.geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ArrayListModifierTest {

    @Test
    public void shouldSuccessfulModifyArray(){
        Integer[] expected = {5,6};
        Integer[] testArray = {1,2,3,4,5,6,4,5,6};
        Assertions.assertArrayEquals(expected, ArrayListModifier.arrayListModify(testArray));
    }

    @Test
    public void shouldThrowRuntimeException(){
        Integer[] testArray = {1,2,3,0,5,6,0,5,6};
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ArrayListModifier.arrayListModify(testArray);
            }
        });
    }
}

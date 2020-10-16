package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCheck {
    private ArrayCheck(){}

    public static boolean arrayChecker(Integer[] array){
        int i = 1;
        int y = 4;
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        if (arrayList.contains(i) && arrayList.contains(y))
            return true;
        else
            return false;

    }
}

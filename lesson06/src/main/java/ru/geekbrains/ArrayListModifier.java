package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListModifier {
    public static Integer[] arrayListModify(Integer[] originalArray){
        int i = 4;

        ArrayList<Integer> originalArrayList = new ArrayList<>(Arrays.asList(originalArray));

        if (!originalArrayList.contains(i)){
            throw new RuntimeException("Original array doesn`t have 4");
        }
        ArrayList<Integer> copyOfOriginalArray = (ArrayList<Integer>) originalArrayList.clone();

        while (copyOfOriginalArray.indexOf(i) >= 0){
            copyOfOriginalArray.remove(0);
        }
        Integer[] finalArray = new Integer[copyOfOriginalArray.size()];
        copyOfOriginalArray.toArray(finalArray);
        return finalArray;
    }
}

package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;

public class ApplicationStart {
    public static void main(String[] args) {
        Integer[] arrayList = new Integer[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arrayList[i] = random.nextInt(9);
        }
        System.out.println(Arrays.toString(arrayList));
        System.out.println(Arrays.toString(ArrayListModifier.arrayListModify(arrayList)));

        Integer[] testArray = new Integer[] {1, 4, 2};
        System.out.println(ArrayCheck.arrayChecker(arrayList));
        System.out.println(ArrayCheck.arrayChecker(testArray));

    }
}

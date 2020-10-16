package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ApplicationStart {
    public static void main(String[] args) {
        ArrayListModifier a = new ArrayListModifier();
        Integer[] arrayList = new Integer[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arrayList[i] = random.nextInt(9);
        }
        System.out.println(Arrays.toString(arrayList));
        System.out.println(Arrays.toString(a.arrayListModify(arrayList)));
    }
}

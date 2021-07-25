package com.agnes;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public void solution(List<Integer> listNumbers) {

        List<Integer> sortedList= listNumbers.stream()
                .collect(Collectors.toList());

        Collections.sort(sortedList);

        for (int i : sortedList) {
            for (int n : sortedList) {
                if (i + n == 13 && i < n) {
                    System.out.println(i + " " + n);
                }
            }
        }
    }
}

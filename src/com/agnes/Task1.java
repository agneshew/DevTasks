package com.agnes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public void solution(List<Integer> listNumbers) {

        List<Integer> listNumbersWithoutDuplicates= listNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        Collections.sort(listNumbersWithoutDuplicates);

        System.out.println(Arrays.toString(listNumbersWithoutDuplicates.toArray()));
        System.out.println("count: " + listNumbers.size());
        System.out.println("distinct: " + listNumbersWithoutDuplicates.size());
        System.out.println("min: " + listNumbersWithoutDuplicates.get(0));
        System.out.println("max: " + listNumbersWithoutDuplicates.get(listNumbersWithoutDuplicates.size()-1));
    }
}

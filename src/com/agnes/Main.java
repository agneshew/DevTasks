package com.agnes;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nTask 1");
        Task1 task1 = new Task1();
        task1.solution(List.of(1, 10, 20, 20, 2, 5));

        System.out.println("\nTask 2");
        Task2 task2 = new Task2();
        task2.solution(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0));

        System.out.println("\nTask 3");
        
        int n = 3;
        int[][] tableOfPairs = new int[n][2];
        tableOfPairs[0][0] = 2;
        tableOfPairs[0][1] = 3;
        tableOfPairs[1][0] = 1;
        tableOfPairs[1][1] = 2;
        tableOfPairs[2][0] = 5;
        tableOfPairs[2][1] = 6;

        Task3 task3 = new Task3();
        task3.solution(n, tableOfPairs);
    }
}

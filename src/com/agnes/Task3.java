package com.agnes;

public class Task3 {

    public void solution(int n, int[][] tableOfPairs) {

        // We can also use the BFS / DFS graph search

        int numberOfGraphs = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tableOfPairs[i][0] == tableOfPairs[j][1]) {
                    numberOfGraphs--;
                }
            }
        }
        System.out.println(numberOfGraphs);
    }
}

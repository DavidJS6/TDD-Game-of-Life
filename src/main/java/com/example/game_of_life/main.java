package com.example.game_of_life;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        System.out.println("Hello world!");


        // 1 2 3
        // 4 5 6
        int[][] example = new int[][]{{1,2,3}, {4,5,6}};
        System.out.println(example[0][1]);
        System.out.println(example[1][0]);


        int min = 0;
        int max = 1;
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            System.out.println( random.nextInt(2) );
        }

    }

}

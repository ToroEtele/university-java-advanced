package com.company;

public class Fourth {
    public static void main(String[] args) {
        //4. Feladat
        int n;
        try{
            n = Integer.parseInt(args[0]);
        } catch (Exception e){
            n = 10;
        }

        int array[][];
        array = new int[n][];
        int tmp = 1;
        int val = 1;
        for( int i = 0; i<n ; i++) {
            array[i] = new int[tmp];
            for( int j = 0; j<tmp; ++j) {
                array[i][j] = val;
                System.out.print(array[i][j] + " ");
                val++;
            }
            System.out.println("");
            tmp++;
        }
    }
}

package com.company;

public class Third {
    public static void main(String[] args) {
        //3. Feladat
        for (int i = 0; i < args.length; ++i) {
            for(int j = 0; j < args[i].length(); ++j){
                if( Character.isAlphabetic(args[i].charAt(j))) {
                    if (Character.isLowerCase(args[i].charAt(j))){
                        System.out.print(Character.toUpperCase(args[i].charAt(j)));
                    } else {
                        System.out.print(Character.toLowerCase(args[i].charAt(j)));
                    }
                }
            }
            System.out.println("");
        }
    }
}

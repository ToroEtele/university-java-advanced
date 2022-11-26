package com.company;

public class Second {
    public static void main(String[] args) {
        //2. Feladat
        int paros = 0;
        int paratlan = 0;
        for (int i = 0; i < args.length; ++i) {
            try{
                var tmp = Integer.parseInt(args[i]);
                if (tmp % 2 == 0) paros+=tmp; else paratlan+=tmp;
            } catch (Exception e){
                System.out.println("Csak egesz szamokat veszunk figyelembe.");
            }
        }
        System.out.println("Paros szamok osszege: " + paros);
        System.out.println("Paratlan szamok osszege: " + paratlan);

    }
}

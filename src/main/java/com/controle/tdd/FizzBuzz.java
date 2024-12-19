package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbre){
        String res = "";
        if (nbre % 3 == 0){
            res = "Fizz";
        }
        else {
            res = String.valueOf(nbre);
        }
        return res;
    }
}

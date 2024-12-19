package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbre){
        String res = "";
        if(nbre % 3 == 0 && nbre % 5 == 0){
            res = "FizzBuzz";
        }else if (nbre % 3 == 0){
            res = "Fizz";
        }else if (nbre % 5 == 0){
            res = "Buzz";
        }else {
            res = String.valueOf(nbre);
        }
        return res;
    }
}

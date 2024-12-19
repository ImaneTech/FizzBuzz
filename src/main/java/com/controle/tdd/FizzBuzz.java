package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbre){
        String res = "";
        if(nbre ==1){
            res="1";
        }else if(nbre ==2){
            res="2";
        }
        else if(nbre ==3){
            res= "Fizz";
        }
        return res;
    }
}

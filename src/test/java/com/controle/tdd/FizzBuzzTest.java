package com.controle.tdd;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/*
  FizzBuzz.de(1) → "1"
  FizzBuzz.de(1) → "2"
  FizzBuzz.de(3) → "Fizz"
  FizzBuzz.de(4) → "4"
  FizzBuzz.de(5) → "Buzz"
  FizzBuzz.de(15) → "FizzBuzz"
  FizzBuzz.de(20) → "Buzz"
 */


public class FizzBuzzTest {

    @Test
    void fizzBuzz_de_1_devrait_retourner_1(){
       // Assertions.fail("echec cycle 1");
        //GIVEN
        String expectedresult ="1";
        //WHEN
        String Actualresult = FizzBuzz.de(1);
        //THEN
        Assertions.assertThat(Actualresult).isEqualTo(expectedresult);
    }
    @Test
    void fizzBuzz_de_2_devrait_retourner_2(){
       //  Assertions.fail("echec cycle 2");

    }

}

package com.campusdual.classroom;

import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
       int blueCount = 0;
       String currentColor="";
        do {
           currentColor = getBall();
           System.out.println( "La bola es de color:"+currentColor);
           if (currentColor.equals("azul")) blueCount++;
        }
        while(blueCount<2);
    };



    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        int num = randomWithRange(1, 4);
        String  COLOR_BOLA ="";
        switch (num){
            case 1: COLOR_BOLA= "rojo";
            break;
            case 2: COLOR_BOLA= "azul";
            break;
            case 3: COLOR_BOLA= "verde";
            break;
        }
        return COLOR_BOLA;
    }


    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}
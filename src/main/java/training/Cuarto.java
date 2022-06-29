package training;

import java.util.Random;

public class Cuarto {
    public static void main(String[] args){
        Calzon amarillo = new Calzon("amarillo", "sedosa", "apreta");
        Calzon nozlac = new Calzon("rojo", "arrugada", "suelta");


        Calzon[] boxeDeCalzones = {amarillo, nozlac};

        int random = (new Random().nextInt(100)) % boxeDeCalzones.length;

        System.out.println("Quemamos a..........");
        System.out.println(boxeDeCalzones[random].getColor());
    }
}

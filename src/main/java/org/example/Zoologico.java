package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.setNombre("Cebra");
        animal1.setGenero("M");


        Animal animal2 = new Animal();
        animal2.setNombre("Caballo");
        animal2.setGenero("F");


        animal1.encontrarPareja(animal2); //Un animal consigue pareja


        Familia familia = new Familia(animal1,animal2);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();

    }
}
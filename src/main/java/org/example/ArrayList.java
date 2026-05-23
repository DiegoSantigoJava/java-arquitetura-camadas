package org.example;

public class ArrayList {
    public static void main(String[] args) {
        String[] nomes = {
                "Ariel",
                "Manel",
                "Jose Pedro"

        };

        String[] novoNomes = new String[4];

        novoNomes[0] = nomes[0];
        novoNomes[1] = nomes[1];
        novoNomes[2] = nomes[2];
        novoNomes[3] = "Matheus.W";

        System.out.println("Nomes de Amigos");
        System.out.println("-------------------");
        for (String nome : novoNomes) {
            System.out.println("Super Amigos: " + nome);
        }

        java.util.ArrayList<String> pets = new java.util.ArrayList<>();

//        pets.add();           adiciona um valor
//        pets.remove();        remove um valor
//        pets.get();           pega um valor
//        pets.set(0, "ex");    altera um valor
//        pets.contains("ex");  verificar se tem um valor

        pets.add("gato");
        pets.add("cachorro");
        pets.add("cobra");
        pets.add("vaca");
        pets.add("pato");
        pets.add("galinha");
        pets.add("porco da india");

        pets.remove(3);

        pets.set(3, "macaco");

        System.out.println("-------------------");
        System.out.println("Verificar se tem um valor");
        System.out.println("-------------------");
        System.out.println(pets.contains("galinha"));
        System.out.println("-------------------");

        System.out.println();
        System.out.println("Nomes de Animais");
        System.out.println("-------------------");
        for (String pet : pets) {
            System.out.println(pet);
        }

        System.out.println();
        System.out.println("Melhores Pet");
        System.out.println("-------------------");
        System.out.println(pets.get(0));
        System.out.println(pets.get(1));
        System.out.println("-------------------");


        System.out.println();
        System.out.println("Total de items de cada array ");
        System.out.println("-------------------");

        System.out.println("Array novoNomes: " + novoNomes.length);
        System.out.println("Array pets: " + pets.size());



        System.out.println();
        System.out.println("Outra forma de mostra a lista completa! ");
        System.out.println("-------------------");
        System.out.println("Nomes de Amigos");
        System.out.println("-------------------");
        for (int i = 0; i < novoNomes.length; i++) {
            System.out.println("Super amigos: " + novoNomes[i]);
        }

        System.out.println();
        System.out.println("Nomes de Animais");
        System.out.println("-------------------");
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }
    }
}
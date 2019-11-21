package org.AnimalRescuer;

public class Game {

    public static void main(String[] args) {



    Animal animalReference = new Animal();
    animalReference.name ="Azorel";
    animalReference.age =7;
    animalReference.health =5;
    animalReference.hungry =6;
    animalReference.mood =7;
    animalReference.favoriteFood ="pedigree";
    animalReference.favoriteActivity ="run";
        System.out.println( "Welcome to the Animal game!" );

        Adopter adopterReference = new Adopter();
        adopterReference.name ="Sorin";
    adopterReference.money =100;


       Vet vetReference = new Vet();
        vetReference.name = "Razvan";
        vetReference.specialization = "medic";

}
}

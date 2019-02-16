package ca.nscc;

public class Main {

    public static void main(String[] args) {

        Animal ethanAnimal = new Animal("Tiger", 500, "Jungle", true);


        //prints species of "ethanAnimal" by calling getter.
        System.out.print(ethanAnimal.getSpecies());
        //Sets the species name to Lion using setter.
        ethanAnimal.setSpecies("Lion");

        String result = ethanAnimal.feedAnimal("Steak");
        System.out.println(result);

        Animal aCow = new Animal("Bovine", 1000, "Medow", false);

        aCow.getSpecies();



    }
}

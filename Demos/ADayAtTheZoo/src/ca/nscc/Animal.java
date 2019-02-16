package ca.nscc;

public class Animal {
    //internal class variables
    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;

    //Constructor Default

    public Animal() {
        this.maxWeight = 0.0;
        this.isEndangered = false;
    }

    //Overloaded constructor
    public Animal(String species,
                  double maxWeight,
                  String habitat,
                  boolean isEndangered) {
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;

    }

    //getter method. Would make one for each of the four properties.
    public String getSpecies() {
        return this.species;
    }
    public double getmaxWeight() {
        return this.maxWeight;
    }
    public String getHabitat() {
        return this.habitat;
    }
    public boolean isEndangered() {
        return this.isEndangered;
    }

    //Property setters.
    public void setSpecies(String species){
        this.species = species;
    }
    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void setisEndangered(boolean isEndangered) {
        this.isEndangered = isEndangered;
    }

    //Type of food string to feed animal.
    public String typeOfFood(String typeOfFood) {
    }
    //Returns a string ready to print with animal species and type of food fed to it.
    public String feedAnimal(){
        return "You fed the " + this.species + "a " + typeOfFood();
    }

}

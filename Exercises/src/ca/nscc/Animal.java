package ca.nscc;

public class Animal {
    //internal class variables
    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;

    //Constructor

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


    public void typeofFood() {

    }


    public void feedAnimal(){
        System.out.println("You fed the " + this.species + "a " + typeofFood);
    }

    public toString() {

    }


}

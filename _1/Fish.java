package _1;

public class Fish extends Animal{

    private String species;
    public Fish(double height, double weight, String species) {
        super(height, weight);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double swimSpeedMetersPerSecond(){
        return this.getWeight() * 2;
    }
}

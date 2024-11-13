package ir.ac.kntu;

public class SimulatedAnimal {
    private int energy;
    private int hunger;
    private int boredom;
    private int intelligence;
    private String name;
    private AnimalType type;

    // Constants for bounds
    private static final int MAX_ENERGY = 10;
    private static final int MIN_ENERGY = 0;
    private static final int MAX_INTELLIGENCE = 50;
    private static final int MIN_INTELLIGENCE = 0;
    private static final int MAX_HUNGER = 10;
    private static final int MIN_HUNGER = 0;
    private static final int MAX_BOREDOM = 10;
    private static final int MIN_BOREDOM = 0;

    enum AnimalType {
        MAMMAL,
        BIRD,
        REPTILE
    }

    enum FoodType {
        MEAT,
        VEGETABLE,
        FRUIT
    }

    enum ActivityType {
        HUNTING,
        EXPLORING
    }

    // Constructor
    public SimulatedAnimal(String name, AnimalType type, int energy, int hunger, int boredom, int intelligence) {
        this.name = name;
        this.type = type;
        this.energy = Math.max(MIN_ENERGY, Math.min(MAX_ENERGY, energy)); // Ensure within bounds
        this.hunger = Math.max(MIN_HUNGER, Math.min(MAX_HUNGER, hunger)); // Ensure within bounds
        this.boredom = Math.max(MIN_BOREDOM, Math.min(MAX_BOREDOM, boredom)); // Ensure within bounds
        this.intelligence = Math.max(MIN_INTELLIGENCE, Math.min(MAX_INTELLIGENCE, intelligence)); // Ensure within
                                                                                                  // bounds
    }

    // Getters
    public int getBoredom() {
        return boredom;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHunger() {
        return hunger;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    // Setters with validation
    public void setBoredom(int boredom) {
        this.boredom = Math.max(MIN_BOREDOM, Math.min(MAX_BOREDOM, boredom)); // Ensure within bounds
    }

    public void setEnergy(int energy) {
        this.energy = Math.max(MIN_ENERGY, Math.min(MAX_ENERGY, energy)); // Ensure within bounds
    }

    public void setHunger(int hunger) {
        this.hunger = Math.max(MIN_HUNGER, Math.min(MAX_HUNGER, hunger)); // Ensure within bounds
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = Math.max(MIN_INTELLIGENCE, Math.min(MAX_INTELLIGENCE, intelligence)); // Ensure within
                                                                                                  // bounds
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    // Animal behaviors
    void sleep() {
        setEnergy(energy + 3);
    }

    void play() {
        setBoredom(boredom - 2);
    }

    void eat(FoodType food) {
        switch (food) {
            case MEAT:
                setHunger(hunger - 3);
                break;
            case VEGETABLE:
                setHunger(hunger - 2);
                break;
            case FRUIT:
                setHunger(hunger - 1);
                break;
        }
    }

    void learn(ActivityType activity) {
        switch (activity) {
            case HUNTING :
                setIntelligence(intelligence + 5);
            case EXPLORING :
                setIntelligence(intelligence + 3);
        }
    }

    // @Override
    // public String toString() {
    //     return String.format("Animal{Name: %s, Type: %s, Energy: %d, Hunger: %d, Boredom: %d, Intelligence: %d}",
    //             name, type, energy, hunger, boredom, intelligence);
    // }

    // public static void main(String[] args) {
    // // Create an instance of SimulatedAnimal
    // SimulatedAnimal animal = new SimulatedAnimal("a", AnimalType.MAMMAL, 10, 10,
    // 10, 10);

    // System.out.println("Initial state: " + animal);

    // // Eating actions
    // animal.eat(FoodType.MEAT);
    // System.out.println("After eating MEAT: " + animal);

    // animal.eat(FoodType.VEGETABLE);
    // System.out.println("After eating VEGETABLE: " + animal);

    // // Instead of getEnergy, we will demonstrate sleeping
    // animal.sleep();
    // System.out.println("After sleeping: " + animal);
    // }
}

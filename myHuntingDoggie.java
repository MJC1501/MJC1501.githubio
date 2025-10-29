class HuntingDoggie extends Doggie {
    String huntingSpecialty;
    boolean currentlyHunting;

    public HuntingDoggie(String name, String breed, int age, String huntingSpecialty, boolean currentlyHunting) {
        super(name, breed, age); // Call the superclass constructor
        this.huntingSpecialty = huntingSpecialty;
        this.currentlyHunting = currentlyHunting;
    }

    // Override displayInfo to show additional information
    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Specialty: " + huntingSpecialty + ", Hunting: " + currentlyHunting);
    }
    
    // Method for tracking prey
    public void trackPrey() {
        System.out.println(name + " is tracking its prey for " + huntingSpecialty + ".");
    }

    // Setter for currentlyHunting
    public void setCurrentlyHunting(boolean currentlyHunting) {
        this.currentlyHunting = currentlyHunting;
        System.out.println(name + " hunting status set to: " + currentlyHunting);
    }
}
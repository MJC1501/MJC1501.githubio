// Macy Culbertson
// For SD class 2025
// Program has methods for the huntingdoggie class
class HuntingDoggie extends Doggie {
    String huntingSpecialty;
    boolean currentlyHunting;

    public HuntingDoggie(String name, String breed, int age, String huntingSpecialty, boolean currentlyHunting) {
        super(name, breed, age); 
        this.huntingSpecialty = huntingSpecialty;
        this.currentlyHunting = currentlyHunting;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Specialty: " + huntingSpecialty + ", Hunting: " + currentlyHunting);
    }
    
   
    public void trackPrey() {
        System.out.println(name + " is tracking its prey for " + huntingSpecialty + ".");
    }


    public void setCurrentlyHunting(boolean currentlyHunting) {
        this.currentlyHunting = currentlyHunting;
        System.out.println(name + " hunting status set to: " + currentlyHunting);
    }
}
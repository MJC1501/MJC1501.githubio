class ShowDoggie extends Doggie {
    String talent;
    int awards;

    public ShowDoggie(String name, String breed, int age, String talent, int awards) {
        super(name, breed, age); // Call the superclass constructor
        this.talent = talent;
        this.awards = awards;
    }

    // Override displayInfo to show additional information
    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Talent: " + talent + ", Awards: " + awards);
    }
    
    // Method for performing a trick
    public void performTrick() {
        System.out.println(name + " performs its " + talent + " trick!");
    }

    // Method to add an award
    public void addAward() {
        this.awards++;
        System.out.println(name + " won another award! Total awards: " + awards);
    }
}


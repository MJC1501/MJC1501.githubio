// Macy Culbertson
// For SD class 2025
// Program has methods for the showdoggie class
class ShowDoggie extends Doggie {
    String talent;
    int awards;

    public ShowDoggie(String name, String breed, int age, String talent, int awards) {
        super(name, breed, age); 
        this.talent = talent;
        this.awards = awards;
    }

   
    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Talent: " + talent + ", Awards: " + awards);
    }
   
    public void performTrick() {
        System.out.println(name + " performs its " + talent + " trick!");
    }

 
    public void addAward() {
        this.awards++;
        System.out.println(name + " won another award! Total awards: " + awards);
    }
}


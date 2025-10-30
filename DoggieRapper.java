//Macy Culbertson
// For SD class
public class DoggieRapper {
    public static void main(String[] args) {
       
        Doggie dog1 = new Doggie("Birdie", "Golden Retriever", 1);
        Doggie dog2 = new Doggie("Ducky", "Brittney", 3);
        Doggie dog3 = new Doggie("Tate", "Pointer", 5);

        
        ShowDoggie myShowDoggie = new ShowDoggie("Kudos", "Spaniel", 5, "Agility", 19);
        HuntingDoggie myHuntingDoggie = new HuntingDoggie("Fred", "German Wired hair Pointer", 7, "Duck hunting", true);

        // Actions for Dog 1
        System.out.println("--- Dog 1 Actions ---");
        dog1.displayInfo();
        dog1.bark();
        dog1.fetch("ball");
        dog1.oneYearGoesBy();
        dog1.displayInfo();

        // Actions for Dog 2
        System.out.println("\n--- Dog 2 Actions ---");
        dog2.displayInfo();
        dog2.bark();
        dog2.fetch("Duck Dummy");
        dog2.oneYearGoesBy();
        dog2.displayInfo();

        // Actions for Dog 3
        System.out.println("\n--- Dog 3 Actions ---");        dog3.displayInfo();
        dog3.bark();
        dog3.fetch("frisbee");
        dog3.oneYearGoesBy();
        dog3.displayInfo();

        // Actions for ShowDoggie
        System.out.println("\n--- ShowDoggie Actions ---");
        myShowDoggie.displayInfo();
        myShowDoggie.bark();
        myShowDoggie.performTrick();
        myShowDoggie.addAward();
        myShowDoggie.displayInfo();

        // Actions for HuntingDoggie
        System.out.println("\n--- HuntingDoggie Actions ---");
        myHuntingDoggie.displayInfo();
        myHuntingDoggie.bark();
        myHuntingDoggie.trackPrey();
        myHuntingDoggie.setCurrentlyHunting(true);
        myHuntingDoggie.displayInfo();
    }}

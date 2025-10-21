public class DoggieRapper {
// Doggie Rapper function to create and interact with Dog objects

    public static void main(String[] args) {
        
        Doggie dog1 = new Doggie("Birdie", "Golden Retriever", 1);
        Doggie dog2 = new Doggie("Ducky", "Brittney", 3);
        Doggie dog3 = new Doggie("Tate", "Pointer",5);

       
        System.out.println(" Dog 1 Actions ");
        dog1.displayInfo();
        dog1.bark();
        dog1.fetch("ball");
        dog1.oneYearGoesBy(); // Change age attribute
        dog1.displayInfo();

       
        System.out.println("\n Dog 2 Actions ");
        dog2.displayInfo();
        dog2.name = "Ducky"; // Change name attribute
        dog2.bark();
        dog2.fetch("Duck Dummy");
        dog2.oneYearGoesBy(); // Change age attribute
        dog2.displayInfo();

        System.out.println("\n Dog 3 Actions ");
        dog3.displayInfo();
        dog3.age = 5; // Change age attribute
        dog3.bark();
        dog3.fetch("frisbee");
        dog3.oneYearGoesBy(); // Change age attribute
        dog3.displayInfo();
    }
}


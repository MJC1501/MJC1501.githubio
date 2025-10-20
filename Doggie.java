public class Doggie {
    String name;
    String breed;
    int age;

    // Dog objects
    public Doggie(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Methods 
    public void bark() {
        System.out.println(name + " says Ruff! Ruff! ");
    }

    public void fetch(String item) {
        System.out.println(name + " is fetching the " + item + "!");
    }

    public void oneYearGoesBy() {
        age++;
        System.out.println(name + " is now " + age + " years old!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }
}


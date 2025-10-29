class Doggie {
    String name;
    String breed;    int age;
    public Doggie(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }
    
    // Method to simulate a dog barking
    public void bark() {
        System.out.println(name + " barks!");
    }

    // Method to simulate fetching
    public void fetch(String item) {
        System.out.println(name + " fetches the " + item + ".");}
        public void oneYearGoesBy() {
        this.age++;
        System.out.println(name + " is now " + age + " years old.");
    }
{
    }}


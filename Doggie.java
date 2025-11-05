//Macy Culbertson
// For SD class
// Updated file to compare Doggies
public class Doggie implements Comparable<Doggie>{
    
    String name;
    String breed;    
    int age;
    int weight;
    public Doggie(String name, String breed, int weight, int age) {
        this.name = name;
        this.breed = breed;
         this.weight = weight;
        this.age = age;
       
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }
    
    public void bark() {
        System.out.println(name + " barks!");
    }

    public void fetch(String item) {
        System.out.println(name + " fetches the " + item + ".");}
        public void oneYearGoesBy() {
        this.age++;
        System.out.println(name + " is now " + age + " years old.");
    }

    public Doggie(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getweight() {
        return weight;
    }
    public void setweight(int weight) {
        this.weight = weight;
    }
    public int age(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
    public int compareTo(Doggie obj){
   
        if (this.age == obj.age){
      return (this.weight)-obj.weight;  
    }
    return (this.age)-obj.age;
    }

    public String toString(){
        return " This dogs name is " +  name + "  It's breed is " + breed + " It's weight is " + weight + " It is " + age + " years old " + System.lineSeparator();
    }
    
   
}

 


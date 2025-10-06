public class Dog {

    

    String name;// current name of the Dog
    int humanYear;// human year the Dog is 
    int dogAge;// dog year compared to human year
    String[] names; //array of old names of the Dog
    int numberofNames=0; //how many old names are there.
   
    public Dog(String dogName, int year, int age){ //dog constructor needs its name and birth year.
        name=dogName; //assigns the name of the dog to the horseName which was sent in the construtor.
        humanYear=year; //assigns the year to the humanYear that was sent in the constructor;
        dogAge=age;// assigns the age to the dog year;
        names = new String [10];
    };
    
    public void age (){
        // what should be in a age function?
    }; 
    public void changeName (String newName){//change the name but save the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    };
    public String toString (){
        return name + " born in " + humanYear + " and is " + dogAge + " years old";
    }
        
}






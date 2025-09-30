 
//Simple horse class created by Kim Gross
//for CTE Software Development class 202

public class Horse {
    
    
public static void main(String[] args) {
    
   Horse horse1=new Horse("june",1990);
    
    Horse horse2=new Horse("harry",2010);

    Horse horse3=new Horse("bobby",2015);
}
    
    
}
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
    public Horse (String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
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
        return name;

      System.out.println("horse1");  
       System.out.println("horse2");
        System.out.println("horse3");

};




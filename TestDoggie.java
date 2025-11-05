//Macy Culbertson
//For SD assignment Interface
// 2026
import java.util.ArrayList;
import java.util.Collections;

public class TestDoggie {

    public static void main(String[] args) {
        
		ArrayList<Doggie> doggieList = new ArrayList<Doggie>();
 
		doggieList.add(new Doggie("Rocky","Retriver", 80, 7));
		doggieList.add(new Doggie("Roxy","lab", 10, 10));
		doggieList.add(new Doggie("Sunny","poodle", 35, 3));
		doggieList.add(new Doggie("Scout","poodle", 42, 4));
        doggieList.add(new Doggie("Joker","poodle", 85, 5));
        doggieList.add(new Doggie("Buddy","poodle", 60, 15));
        doggieList.add(new Doggie("Tracker", "poodle",30, 12));
        doggieList.add(new Doggie("Jeffery","poodle", 20, 11));
        doggieList.add(new Doggie("Princess", "poddle",8, 2));
        doggieList.add(new Doggie("Maggie", "poodle",50, 1));
        System.out.println(doggieList);
		Collections.sort(doggieList);
        System.out.println(" Sorting list ");
        System.out.println(doggieList);
		
	}
}



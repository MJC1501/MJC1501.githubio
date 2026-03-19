public class Player {
    String name;
    String sport;
    String spotinline;

    public Player(String name, String sport, String spotinline) {
        this.name = name;   
        this.sport = sport; 
        this.spotinline = spotinline;
    }

    @Override
    public String toString() {
        return   name + "'s" + " sport is " + sport + " and is in the " + spotinline 
        + " spot in line to get tickets.";
    }

    }



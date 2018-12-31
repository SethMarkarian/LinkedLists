public class Player extends FootballClubMember 
{
    private String position; //instance String variable

    public Player(String first, String last, String pos, float pay) { //constructor 
        super(first, last, pay); //calls constructor from parent class
        position = pos; //sets input to instance variable
    }
    
    public String getPosition() { //getter for positon
        return position; //returns instance variable
    }
    
    public String toString() { //overrides abstract method
        return "Player, " + getFirstName() + " " + getLastName() + ". Position : " + getPosition() + ". Pay: " + getPay(); //returns player information
    }
    
    public float calculatePay() { //overrides abstract method
        return getPay() / 52; //returns player's correct pay
    }
    
    public int compareTo(FootballClubMember pl){ //overrides implemented comparable in FootballClubMember
        Player p = (Player) pl; //cast dow to Player
        if(this.getPosition().compareTo(p.getPosition()) != 0) { //checks to see if different positions
            return this.getPosition().compareTo(p.getPosition()); //returns value of compared strings
        }
        else { //if same position
            if(this.getLastName().compareTo(p.getLastName()) != 0) { //checks to see if different last names
                return this.getLastName().compareTo(p.getLastName()); //returns value of compared strings
            }
            else { //if same last name
                return this.getFirstName().compareTo(p.getFirstName()); //returns value of compared strings
            }
        }
    }
}

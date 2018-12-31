public class Staff extends FootballClubMember
{
    private int hoursWorked; //integer instance variable
    private float overtime; //float instance variable

    public Staff(String first, String last, float pay, int hw) { //constructor
        super(first, last, pay); //calls constructor in parent class
        hoursWorked = hw; //assigns input to instance variable
    }
 
    public int getHoursWorked() { //getter for hoursWorked
        return hoursWorked; //return instance variable
    }

    public String toString() { //overrides
        return "Staff, " + getFirstName() + " " + getLastName() + ". Pay: " + getPay(); //returns data
    }

    public int compareTo(FootballClubMember pl){ //overrides compareTo
        Staff p = (Staff) pl; //casts down to stafff
        if(this.getLastName().compareTo(p.getLastName()) != 0) { //checks if last name is different
            return this.getLastName().compareTo(p.getLastName()); //compares last names
        }
        else { //if last names are the same
            return this.getFirstName().compareTo(p.getFirstName()); //compares first name
        }
    }

    public float calculatePay() { //overrides calculatePay method
        if(hoursWorked > 40) { //if worked overtime
            overtime = hoursWorked - 40; //calculates overtime 
            return (float) ((getPay() * 40) + (overtime * (getPay() * 1.5))); //calculates pay with overtime
        }
        else { //if no overtime
            return getPay() * getHoursWorked(); //calculates regular pay
        }
    }
}

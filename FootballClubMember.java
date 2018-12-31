public abstract class FootballClubMember implements Comparable<FootballClubMember>{
    
    private String first, last; //instance String variables
    private float pay; //instance float variable
    
    public FootballClubMember(String firstName, String lastName, float p) { //contructor
        first = firstName; //assings input to instance variable
        last = lastName; //assings input to instance variable
        pay = p; //assings input to instance variable
    }
    
    public String getFirstName() { //getter first name
        return first; //return instance variable
    }
    
    public String getLastName() { //getter last name
        return last; //return instance variable
    }
    
    public float getPay() { //getter pay
        return pay; //return instance variable
    }
    
    public abstract float calculatePay(); //abstract method to calculate pay in child classes
    public abstract String toString(); //abstract method to print elements of child classes
}

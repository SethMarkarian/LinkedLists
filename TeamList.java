import java.util.*;
public class TeamList<T extends Comparable<T>>
{
    protected LinkedList<T> teamList; //teamlist instance variable

    public TeamList() { //constructor
        teamList = new LinkedList<T>(); //new instance
    }

    public void addElement(T fcm) { //adds element to end of teamlist
        teamList.add(fcm); //adds element to end of linked l
    }
 
    public void mergeSort(LinkedList<T> team) { //sorts LinkedList using mergesort
        if(team.size() <= 1) { //if the team has 1 or less elements
            return; //don't do anything
        }
        if(team.size() > 1) { //if there is more than 1 element 
            LinkedList<T> left = new LinkedList<T>(); //create left 
            LinkedList<T> right = new LinkedList<T>(); //creates right
            boolean canSwitch = true; //initializes the canSwitch
            while(!team.isEmpty()) { //while there are still elements in the list
                if(canSwitch) { //boolean is true
                    left.add(team.pop()); //adds element to left
                } 
                else { //if boolean is false
                    right.add(team.pop()); //adds element to right
                }
                canSwitch = !canSwitch; //switches boolean value
            }   
            mergeSort(left); //recursion for left side
            mergeSort(right); //recursion for right side
            teamList.addAll(merge(left, right)); //merges left and right into one list
        }
    }
    
    private LinkedList<T> merge(LinkedList<T> left, LinkedList<T> right) { //merges left and right into one list
        LinkedList<T> merged = new LinkedList<T>(); //creates new list
        while(!left.isEmpty() && !right.isEmpty()) { //checks to see if left and right are not empty
            if(left.peek().compareTo(right.peek()) <= 0) { //compares right and left element
                merged.add(left.pop()); //chooses left string
            } 
            else { //if not
                merged.add(right.pop()); //chooses right string
            }
        }
        merged.addAll(left); //adds the rest of left
        merged.addAll(right); //adds the rest of right
        return merged; //returns list
    }

    public void printData() { //prints data from list
        for(T obj : teamList) { //loops through list
            System.out.println(obj.toString()); //calls toString
        }
    }
}

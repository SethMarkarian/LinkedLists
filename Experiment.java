import java.io.*;
import java.util.*;
public class Experiment
{
    public static void main(String[] args) { //main method
        TeamList playerList = new TeamList(); //list of players
        TeamList staffList = new TeamList(); //list of staff
        try{ 
            BufferedReader br = new BufferedReader(new FileReader("coys.csv")); //reads the csv
            String line = null; //initializes line
            while ((line = br.readLine()) != null) { //loop while not at the end
                String[] values = line.split(","); //splits elements when its a comma
                ArrayList<String> arr = new ArrayList<String>(); //makes new arraylist to insert string elements
                for (String str : values) { //loops over values in array
                    arr.add(str); //adds them to arraylist
                }
                if(arr.get(2).equals("player")) { //checks to see if it is a player type
                    playerList.addElement(new Player(arr.get(0), arr.get(1), arr.get(4), Float.parseFloat(arr.get(3)))); //adds element with data from csv file
                }
                else if(arr.get(2).equals("staff")) { //checks to see if it is a staff type
                    staffList.addElement(new Staff(arr.get(0), arr.get(1), Float.parseFloat(arr.get(3)), Integer.parseInt(arr.get(5)))); //adds element with data from csv
                }
            }
            br.close(); //closes the reader
        }

        catch(Exception e) { //if error
            System.out.println(e); //print out error
        }
        playerList.mergeSort(playerList.teamList); //runs merge sort on list
        playerList.printData(); //prints data
    }
}

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class UnitTest
{
    @Test
    public void testFCMFirstName() {
        Player HarryKane = new Player("Harry", "Kane", "Forward", 1000000);
        String theAns = HarryKane.getFirstName();
        String trueAns = "Harry";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testFCMLastName() {
        Player HarryKane = new Player("Harry", "Kane", "Forward", 1000000);
        String theAns = HarryKane.getLastName();
        String trueAns = "Kane";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testPlayerPosition() {
        Player HarryKane = new Player("Harry", "Kane", "forward", 1000000);
        String theAns = HarryKane.getPosition();
        String trueAns = "forward";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testPlayerPay() {
        Player HarryKane = new Player("Harry", "Kane", "forward", 1000000);
        float theAns = HarryKane.getPay();
        float trueAns = 1000000;
        assertEquals(theAns, trueAns, 1);
    }

    @Test
    public void testPlayerCalculatePay() {
        Player HarryKane = new Player("Harry", "Kane", "forward", 1000000);
        float theAns = HarryKane.calculatePay();
        float trueAns = 19230;
        assertEquals(theAns, trueAns, 1);
    }

    @Test
    public void testStaffFirstName() {
        Staff MauricioPochettino = new Staff("Mauricio", "Pochettino", 30000000, 50);
        String theAns = MauricioPochettino.getFirstName();
        String trueAns = "Mauricio";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testStaffLastName() {
        Staff MauricioPochettino = new Staff("Mauricio", "Pochettino", 30000000, 50);
        String theAns = MauricioPochettino.getLastName();
        String trueAns = "Pochettino";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testStaffPay() {
        Staff MauricioPochettino = new Staff("Mauricio", "Pochettino", 30000000, 50);
        float theAns = MauricioPochettino.getPay();
        float trueAns = 30000000;
        assertEquals(theAns, trueAns, 1);
    }

    @Test
    public void testStaffCalculatePay() {
        Staff MauricioPochettino = new Staff("Mauricio", "Pochettino", 30000000, 50);
        float theAns = MauricioPochettino.calculatePay();
        float trueAns = 1650000000;
        assertEquals(theAns, trueAns, 1);
    }

    @Test
    public void testPlayerCompareToPosition() {
        Player HarryKane = new Player("Harry", "Kane", "forward", 1000000);
        Player GaryCahill = new Player("Gary", "Cahill", "defender", 300000);
        int theAns = HarryKane.compareTo(GaryCahill);
        int trueAns = "forward".compareTo("defender");
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testPlayerCompareToLastName() {
        Player HarryKane = new Player("Harry", "Kane", "forward", 1000000);
        Player GaryCahill = new Player("Gary", "Cahill", "forward", 300000);
        int theAns = HarryKane.compareTo(GaryCahill);
        int trueAns = "Kane".compareTo("Cahill");
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testPlayerCompareToFirstName() {
        Player HarryKane = new Player("Harry", "Kane", "forward", 1000000);
        Player GaryCahill = new Player("Gary", "Kane", "forward", 300000);
        int theAns = HarryKane.compareTo(GaryCahill);
        int trueAns = "Harry".compareTo("Gary");
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testStaffCompareToLastName() {
        Staff MauricioPochettino = new Staff("Mauricio", "Pochettino", 30000000, 50);
        Staff MaurizioSarri = new Staff("Maurizio", "Sarri", 400000, 35);
        int theAns = MauricioPochettino.compareTo(MaurizioSarri);
        int trueAns = "Pochettino".compareTo("Sarri");
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testStaffCompareToFirstName() {
        Staff MauricioPochettino = new Staff("Mauricio", "Pochettino", 30000000, 50);
        Staff MaurizioSarri = new Staff("Maurizio", "Pochettino", 400000, 35);
        int theAns = MauricioPochettino.compareTo(MaurizioSarri);
        int trueAns = "Mauricio".compareTo("Maurizio");
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testAddElement() {
        TeamList pl = new TeamList();
        pl.addElement(new Player("Harry", "Kane", "forward", 1000000));
        pl.addElement(new Staff("Mauricio", "Pochettino", 30000000, 50));
        pl.addElement(new Player("Gary", "Cahill", "forward", 300000));
        pl.addElement(new Staff("Maurizio", "Sarri", 400000, 35));
        assertEquals(pl.teamList.size(), 4);
    }

    @Test
    public void testMergeSort() {
        TeamList pl = new TeamList();
        pl.addElement(new Player("Harry", "Kane", "forward", 1000000));
        pl.addElement(new Player("Jessica", "Naz", "striker", 36400));
        pl.addElement(new Player("Josie", "Naz", "midfielder", 36400));
        pl.addElement(new Player("Victor", "Wanyama", "midfielder", 33800));
        pl.mergeSort(pl.teamList);
        String theAns = pl.teamList.get(0).toString() + " " + pl.teamList.get(1).toString() + " " + pl.teamList.get(2).toString()+ " " + pl.teamList.get(3).toString()+ " " + pl.teamList.get(4).toString();
        String trueAns ="Player, Harry Kane. Pay: 1000000.0 Player, Josie Naz. Pay: 36400.0 Player, Victor Wanyama. Pay: 33800.0 Player, Jessica Naz. Pay: 36400.0";
        assertEquals(theAns,trueAns);
    }
}

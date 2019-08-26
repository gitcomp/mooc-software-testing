package tudelft.gettingstarted;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

    //above same as this:
    @Test
    public void add20toIt() {
    	GettingStarted gs = new GettingStarted();
    	int actualResult = gs.addFive(20);
    	int expectedResult = 25;
    	Assertions.assertEquals(expectedResult, actualResult);
    }
    
    
//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    //above same as this
    @Test
    public void addzerotoit() {
    	GettingStarted gs = new GettingStarted();
    	int actualResult=gs.addFive(0);
    	int expectedResult= 5;
    	Assertions.assertEquals(expectedResult, actualResult);
    }
    
        
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    //above same as this
    @Test
    public void addminus20toit(){
    	int actualResult= new GettingStarted().addFive(-20);
    	int expectedResult= -15;
    	Assertions.assertEquals(expectedResult, actualResult);
    	
    }
        
}

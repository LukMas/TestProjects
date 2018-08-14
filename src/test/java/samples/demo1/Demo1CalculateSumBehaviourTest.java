package samples.demo1;

import org.junit.Assert;
import org.junit.Test;
import samples.exceptions.InvalidDataException;


/**
 * Created by luca on 09.08.18.
 */

public class Demo1CalculateSumBehaviourTest {
    
    @Test
    public void correctSum() {
        Demo1CalculateSum sut = new Demo1CalculateSum(); // sut is for "Subject Under Test" - it helps to identify which class is going to be tested
        
        Assert.assertEquals(Integer.valueOf(4), sut.sum(2, 2));
    }
    
    
    @Test
    public void emptyValueA() {
        Demo1CalculateSum sut = new Demo1CalculateSum();
        
        Assert.assertEquals(Integer.valueOf(2), sut.sum(null, 2));
    }
    
    
    @Test
    public void emptyValueB() {
        Demo1CalculateSum sut = new Demo1CalculateSum();
        
        Assert.assertEquals(Integer.valueOf(1), sut.sum(1, null));
    }
    
    
    @Test(expected = InvalidDataException.class)
    public void emptyBothValues() {
        Demo1CalculateSum sut = new Demo1CalculateSum();
        
        Assert.assertEquals(Integer.valueOf(1), sut.sum(null, null));
    }
}
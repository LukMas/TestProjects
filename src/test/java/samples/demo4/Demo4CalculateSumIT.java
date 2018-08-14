package samples.demo4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by luca on 14.08.18.
 */

public class Demo4CalculateSumIT {
    
    @Test
    public void correctSum() {
        Integer valueA = 2;
        Integer valueB = 20;
        
        Demo4VerifyService verifyService = new Demo4VerifyNotNullServiceImpl();
        
        Demo4CalculateSum sut = new Demo4CalculateSum(verifyService);
        Integer sum = sut.sum(valueA, valueB);
        
        assertEquals(Integer.valueOf(22), sum);
    }
}
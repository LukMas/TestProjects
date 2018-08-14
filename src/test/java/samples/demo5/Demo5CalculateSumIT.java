package samples.demo5;

import org.junit.Test;
import samples.demo5.services.Demo5VerifyService;
import samples.demo5.services.impl.Demo5VerifyServiceTestFactory;

import static org.junit.Assert.assertEquals;


/**
 * Created by luca on 14.08.18.
 */

public class Demo5CalculateSumIT {
    
    @Test
    public void correctSum() {
        Integer valueA = 2;
        Integer valueB = 20;
        
        Demo5VerifyService verifyService = Demo5VerifyServiceTestFactory.create().buildService();
        
        Demo5CalculateSum sut = new Demo5CalculateSum(verifyService);
        Integer sum = sut.sum(valueA, valueB);
        
        assertEquals(Integer.valueOf(22), sum);
    }
    
}
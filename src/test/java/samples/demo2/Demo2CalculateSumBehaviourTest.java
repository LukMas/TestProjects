package samples.demo2;

import org.junit.Assert;
import org.junit.Test;
import samples.demo4.Demo4VerifyService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by luca on 09.08.18.
 */

public class Demo2CalculateSumBehaviourTest {
    
    @Test
    public void correctSum_Mock() {
        // Using a mock framwork
        Integer valueA = 2;
        Integer valueB = 20;
    
        Demo2VerifyService verifyService = mock(Demo2VerifyService.class);
        when(verifyService.isValid(valueA)).thenReturn(true);
        when(verifyService.isValid(valueB)).thenReturn(true);
        
        Demo2CalculateSum sut = new Demo2CalculateSum(verifyService); // here there's the reason that the Autowire on the member should be avoided like hell
        
        Assert.assertEquals(Integer.valueOf(22), sut.sum(valueA, valueB));
    }
    
    
    @Test
    public void emptyValueA_Mock() {
        // Using a mock framwork
        Integer valueA = null;
        Integer valueB = 20;
    
        Demo2VerifyService verifyService = mock(Demo2VerifyService.class);
        when(verifyService.isValid(valueA)).thenReturn(false);
        when(verifyService.isValid(valueB)).thenReturn(true);
        
        Demo2CalculateSum sut = new Demo2CalculateSum(verifyService);
        
        Assert.assertEquals(valueB, sut.sum(valueA, valueB));
    }
    
    
    @Test
    public void emptyValueA_Stub() {
        // Using a stub implementation
        Integer valueA = VerifyServiceStub_Behaviour.INVALID_VALUE;
        Integer valueB = VerifyServiceStub_Behaviour.VALID_VALUE;
    
        Demo2VerifyService verifyService = new VerifyServiceStub_Behaviour();
        
        Demo2CalculateSum sut = new Demo2CalculateSum(verifyService);
        
        Assert.assertEquals(valueB, sut.sum(valueA, valueB));
    }
}
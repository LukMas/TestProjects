package samples.demo3;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;


/**
 * Created by luca on 09.08.18.
 */

public class Demo3CalculateSumInteractionTest {
    
    @Test
    public void correctSum_Mock() {
        Integer valueA = 2;
        Integer valueB = 20;
    
        Demo3VerifyService verifyService = mock(Demo3VerifyService.class);
        when(verifyService.isValid(valueA)).thenReturn(true);
        when(verifyService.isValid(valueB)).thenReturn(true);
        
        Demo3CalculateSum sut = new Demo3CalculateSum(verifyService);
        sut.sum(valueA, valueB);
        
        verify(verifyService, times(2)).isValid(any(Integer.class));
    }
    
    
    @Test
    public void valueANull() {
        Integer valueA = null;
        Integer valueB = 20;
    
        Demo3VerifyService verifyService = mock(Demo3VerifyService.class);
        when(verifyService.isValid(valueA)).thenReturn(false);
        when(verifyService.isValid(valueB)).thenReturn(true);
        
        Demo3CalculateSum sut = new Demo3CalculateSum(verifyService);
        sut.sum(valueA, valueB);
        
        verify(verifyService, times(2)).isValid(valueA);
        verify(verifyService, times(1)).isValid(valueB);
    }
    
    
    @Test
    public void valueANull_Stub() {
        // Using a stub implementation
        Integer valueA = VerifyServiceStub_Interaction.INVALID_VALUE;
        Integer valueB = VerifyServiceStub_Interaction.VALID_VALUE;
        
        VerifyServiceStub_Interaction verifyService = new VerifyServiceStub_Interaction();
        
        Demo3CalculateSum sut = new Demo3CalculateSum(verifyService);
        sut.sum(valueA, valueB);
        
        Assert.assertEquals(2, verifyService.callsWithValue(valueA));
        Assert.assertEquals(1, verifyService.callsWithValue(valueB));
    }
    
    
    @Test
    public void valueBNull_Stub() {
        // Using a stub implementation
        Integer valueA = VerifyServiceStub_Interaction.VALID_VALUE;
        Integer valueB = VerifyServiceStub_Interaction.INVALID_VALUE;
        
        VerifyServiceStub_Interaction verifyService = new VerifyServiceStub_Interaction();
        
        Demo3CalculateSum sut = new Demo3CalculateSum(verifyService);
        sut.sum(valueA, valueB);
        
        Assert.assertEquals(2, verifyService.callsWithValue(valueA));
        Assert.assertEquals(1, verifyService.callsWithValue(valueB));
    }
}
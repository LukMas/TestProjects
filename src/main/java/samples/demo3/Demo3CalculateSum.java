package samples.demo3;

import samples.exceptions.InvalidDataException;


/**
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 09.08.18
 */
public class Demo3CalculateSum {
    
    private Demo3VerifyService verifyService;
    
    
    public Demo3CalculateSum(Demo3VerifyService verifyService) {
        
        this.verifyService = verifyService;
    }
    
    
    public Integer sum(
            Integer valueA,
            Integer valueB) {
        if (verifyService.isValid(valueA) && verifyService.isValid(valueB)) {
            return valueA + valueB;
        } else if (verifyService.isValid(valueA)) {
            return valueA;
        } else if (verifyService.isValid(valueB)) {
            return valueB;
        }
        
        throw new InvalidDataException();
    }
}
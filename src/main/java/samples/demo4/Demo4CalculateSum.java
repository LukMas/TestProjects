package samples.demo4;

import samples.exceptions.InvalidDataException;


/**
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 09.08.18
 */
public class Demo4CalculateSum {
    
    private Demo4VerifyService verifyService;
    
    
    public Demo4CalculateSum(Demo4VerifyService verifyService) {
        
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
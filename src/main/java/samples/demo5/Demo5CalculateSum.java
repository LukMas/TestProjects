package samples.demo5;

import samples.demo5.services.Demo5VerifyService;
import samples.exceptions.InvalidDataException;


/**
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 09.08.18
 */
public class Demo5CalculateSum {
    
    private Demo5VerifyService verifyService;
    
    
    public Demo5CalculateSum(Demo5VerifyService verifyService) {
        
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
package samples.demo1;

import samples.exceptions.InvalidDataException;


/**
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 09.08.18
 */
public class Demo1CalculateSum {
    
    public Integer sum(
            Integer valueA,
            Integer valueB) {
        if (valueA != null && valueB != null) {
            return valueA + valueB;
        } else if (valueA != null) {
            return valueA;
        } else if (valueB != null){
            return valueB;
        }
        
        throw new InvalidDataException();
    }
}
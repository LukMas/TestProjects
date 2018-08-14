package samples.demo3;

/**
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 09.08.18
 */
class VerifyServiceStub_Interaction
        implements Demo3VerifyService {
    
    public static Integer VALID_VALUE       = 10;
    public static Integer INVALID_VALUE     = null;
    private       int     validValueCalls   = 0;
    private       int     invalidValueCalls = 0;
    
    
    public boolean isValid(Integer value) {
        if (VALID_VALUE.equals(value)) {
            validValueCalls++;
            return true;
            
        } else if (INVALID_VALUE == value) {
            invalidValueCalls++;
            return false;
        }
        
        throw new UnknownError();
    }
    
    
    public int callsWithValue(Integer valueA) {
        if (INVALID_VALUE == valueA) {
            return invalidValueCalls;
        }
        return validValueCalls;
    }
}
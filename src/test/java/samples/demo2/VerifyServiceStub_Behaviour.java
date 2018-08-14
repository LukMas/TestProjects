package samples.demo2;

/**
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 09.08.18
 */
class VerifyServiceStub_Behaviour
        implements Demo2VerifyService {
    
    public static Integer VALID_VALUE       = 10;
    public static Integer INVALID_VALUE     = null;
    
    
    public boolean isValid(Integer value) {
        if (VALID_VALUE.equals(value)) {
            return true;
            
        } else if (INVALID_VALUE == value) {
            return false;
        }
        
        throw new UnknownError();
    }
}
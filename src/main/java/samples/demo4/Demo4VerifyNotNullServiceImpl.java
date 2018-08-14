package samples.demo4;


/**
 * Implementation of the verify service that checks if the current integer is valid checking just
 * if it isn't null.
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 14.08.18
 */
class Demo4VerifyNotNullServiceImpl
        implements Demo4VerifyService {
    
    public boolean isValid(Integer value) {
        return value != null;
    }
}
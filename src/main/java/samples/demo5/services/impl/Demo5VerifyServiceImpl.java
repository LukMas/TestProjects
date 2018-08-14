package samples.demo5.services.impl;

import samples.demo5.services.Demo5VerifyService;


/**
 * Implementation of the verify service that checks if the current integer is valid checking just
 * if it isn't null. It's used in the Demo5.
 * <p>
 *
 * @author Luca Masera
 * @version 1.0
 * @since 14.08.18
 */
class Demo5VerifyServiceImpl
        implements Demo5VerifyService {
    
    public boolean isValid(Integer value) {
        return value != null;
    }
}
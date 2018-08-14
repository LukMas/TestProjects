package samples.demo5.services.impl;

import samples.demo5.services.Demo5VerifyService;


/**
 * The factory leaves the implementation of the service accessible only for the package.
 */

public class Demo5VerifyServiceTestFactory {
    
    static public Demo5VerifyServiceTestFactory create() {
        return new Demo5VerifyServiceTestFactory();
    }
    
    
    public Demo5VerifyService buildService() {
        return new Demo5VerifyServiceImpl();
    }
    
    
    private Demo5VerifyServiceTestFactory() {
    }
    
}
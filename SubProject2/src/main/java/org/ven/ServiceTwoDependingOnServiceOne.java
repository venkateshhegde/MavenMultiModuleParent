package org.ven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ven.services.ServiceOne;

/**
 * Service two
 */
public class ServiceTwoDependingOnServiceOne {


    ServiceOne one = new ServiceOne();
    Logger logger = LoggerFactory.getLogger(ServiceTwoDependingOnServiceOne.class);

    /**
     * Service Two API
     */
    public void serviceTwo(){
        logger.info("One Calling Two");
        one.serviceOne();

    }
}

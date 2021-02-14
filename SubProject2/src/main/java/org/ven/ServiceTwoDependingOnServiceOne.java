package org.ven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ven.services.ServiceOne;

public class ServiceTwoDependingOnServiceOne {


    ServiceOne one = new ServiceOne();
    Logger logger = LoggerFactory.getLogger(ServiceTwoDependingOnServiceOne.class);
    public void serviceTwo(){
        logger.info("One Calling Two");
        one.serviceOne();

    }
}

package org.ven.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service One
 */
public class ServiceOne {

    Logger logger   = LoggerFactory.getLogger(ServiceOne.class);

    /**
     * Service One API
     */
    public void serviceOne(){
        logger.info("Service ONE Called!! ");
    }
}

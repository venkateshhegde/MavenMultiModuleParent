package org.ven.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceOne {

    Logger logger   = LoggerFactory.getLogger(ServiceOne.class);
    public void serviceOne(){
        logger.info("Service ONE Called!! ");
    }
}

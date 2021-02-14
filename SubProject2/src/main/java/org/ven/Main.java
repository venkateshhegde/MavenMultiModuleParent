package org.ven;

/**
 * Main Class
 */
public class Main {
    public static void main(String[] args) {
        ServiceTwoDependingOnServiceOne x =
                new ServiceTwoDependingOnServiceOne();
        x.serviceTwo();
    }
}

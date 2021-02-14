package org.ven;

public class Main {
    public static void main(String[] args) {
        ServiceTwoDependingOnServiceOne x =
                new ServiceTwoDependingOnServiceOne();
        x.serviceTwo();
    }
}

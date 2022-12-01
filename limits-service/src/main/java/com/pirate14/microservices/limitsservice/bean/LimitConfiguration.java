package com.pirate14.microservices.limitsservice.bean;

public class LimitConfiguration {
    private int maximum;
    private int minimum;

    private LimitConfiguration() {

    }

    public LimitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }


    public int getMinimum() {
        return minimum;
    }
}

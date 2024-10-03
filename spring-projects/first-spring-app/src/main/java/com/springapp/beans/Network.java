package com.springapp.beans;

import org.springframework.stereotype.Component;

@Component
public class Network {

    private boolean available;

    public Network(boolean available) {
        this.available = available;
    }
    public Network() {

    }

    public boolean isAvailable() {
        return available;
    }
}

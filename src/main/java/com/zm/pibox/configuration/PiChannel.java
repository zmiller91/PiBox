/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zm.pibox.configuration;

/**
 *
 * @author zmiller
 */
public enum PiChannel {
    
    TEST("test");

    private final String value;

    private PiChannel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

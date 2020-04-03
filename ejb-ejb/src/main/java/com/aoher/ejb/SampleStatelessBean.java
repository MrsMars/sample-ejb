package com.aoher.ejb;

import javax.ejb.Stateless;

@Stateless
public class SampleStatelessBean {

    private static final String HELLO = "Hello EJB World.";

    public String hello() {
        return HELLO;
    }
}

package com.zqf.lab.pipeline.dao.impl;

import com.zqf.lab.pipeline.dao.Valve;

/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public class BasicValveImpl implements Valve {
    private Valve valve;
    @Override
    public Valve getNext() {
        return this.valve;
    }

    @Override
    public void setNext(Valve valve) {
        this.valve=valve;
    }
    @Override
    public void invoke(String data) {
        System.out.println(BasicValveImpl.class);
    }
}

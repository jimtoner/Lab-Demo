package com.zqf.lab.pipeline.dao;

/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public interface Valve {
    Valve getNext();
    void setNext(Valve valve);
    void invoke(String data);
}

package com.zqf.lab.pipeline.dao;

/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public interface Pipeline {
    Valve getFirst();
    Valve getBasic();
    void setBasic(Valve valve);
    void addValve(Valve valve);
}

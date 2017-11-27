package com.zqf.lab.pipeline;


/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public interface ItfPipeline {
    ItfValve getFirst();
    ItfValve getBasic();
    void setBasic(ItfValve valve);
    void addValve(ItfValve valve);
}

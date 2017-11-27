package com.zqf.lab.pipeline;

/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public interface ItfValve {
    ItfValve getNext();
    void setNext(ItfValve valve);
    void invoke(String data);
}

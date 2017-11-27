package com.zqf.lab.pipeline;

/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public class ImplBasicValve implements ItfValve {
    private ItfValve valve;
    @Override
    public ItfValve getNext() {
        return this.valve;
    }

    @Override
    public void setNext(ItfValve valve) {
        this.valve=valve;
    }
    @Override
    public void invoke(String data) {
        System.out.println(ImplBasicValve.class);
    }
}

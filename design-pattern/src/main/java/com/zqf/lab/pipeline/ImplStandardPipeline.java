package com.zqf.lab.pipeline;

import java.util.LinkedList;

/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public class ImplStandardPipeline implements ItfPipeline {
    private LinkedList<ItfValve> valveList=new LinkedList<>();
    private ItfValve first;
    private ItfValve basic;
    @Override
    public ItfValve getFirst() {
        return this.first;
    }

    @Override
    public ItfValve getBasic() {
        return this.basic;
    }

    @Override
    public void setBasic(ItfValve valve) {
        this.basic=valve;
    }

    @Override
    public void addValve(ItfValve valve) {
        valveList.add(valve);
    }
}

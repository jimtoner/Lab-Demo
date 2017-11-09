package com.zqf.lab.pipeline.dao.impl;

import com.zqf.lab.pipeline.dao.Pipeline;
import com.zqf.lab.pipeline.dao.Valve;

import java.util.LinkedList;

/**
 * @author Chris.zhai
 * @since Nov 03,2017
 */
public class StandardPipelineImpl implements Pipeline {
    private LinkedList<Valve> valveList=new LinkedList<>();
    /*private Valve first;
    private Valve basic;
    @Override
    public Valve getFirst() {
        return this.first;
    }

    @Override
    public Valve getBasic() {
        return this.basic;
    }

    @Override
    public void setBasic(Valve valve) {
        this.basic=valve;
    }*/

    @Override
    public void addValve(Valve valve) {
        valveList.add(valve);
    }
}

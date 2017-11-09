package com.zqf.lab;

import com.zqf.lab.pipeline.dao.impl.BasicValveImpl;
import com.zqf.lab.pipeline.dao.impl.SecondeValveImpl;
import com.zqf.lab.pipeline.dao.impl.StandardPipelineImpl;
import com.zqf.lab.pipeline.dao.impl.ThirdValveImpl;

public class PipelineApp {
    public static void main(String[] args) {
        StandardPipelineImpl standardPipeline=new StandardPipelineImpl();
        standardPipeline.setBasic(new BasicValveImpl());
        standardPipeline.addValve(new ThirdValveImpl());
        standardPipeline.addValve(new SecondeValveImpl());

        standardPipeline.getFirst().invoke("");
    }
}

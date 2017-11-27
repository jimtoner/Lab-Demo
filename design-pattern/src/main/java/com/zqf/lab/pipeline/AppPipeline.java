package com.zqf.lab.pipeline;

public class AppPipeline {
    public static void main(String[] args) {
        ImplStandardPipeline standardPipeline=new ImplStandardPipeline();
        standardPipeline.setBasic(new ImplBasicValve());
        standardPipeline.addValve(new ImplThirdValve());
        standardPipeline.addValve(new ImplSecondeValve());

        standardPipeline.getFirst().invoke("");
    }
}

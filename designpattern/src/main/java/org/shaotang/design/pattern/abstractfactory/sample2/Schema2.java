package org.shaotang.design.pattern.abstractfactory.sample2;

public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainbordApi createMainbordApi() {
        return new MSIMainbord(939);
    }
}

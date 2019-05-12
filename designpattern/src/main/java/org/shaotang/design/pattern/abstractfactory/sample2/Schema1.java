package org.shaotang.design.pattern.abstractfactory.sample2;

public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainbordApi createMainbordApi() {
        return new GAMainboard(1156);
    }
}

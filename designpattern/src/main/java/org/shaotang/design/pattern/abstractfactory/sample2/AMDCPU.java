package org.shaotang.design.pattern.abstractfactory.sample2;

public class AMDCPU implements CPUApi {
    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU,pins=" + pins);
    }
}
